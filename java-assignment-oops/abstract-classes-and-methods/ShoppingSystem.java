package dynamic;

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();
    
    public double getPrice() {
        return price;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Description: " + getDescription());
    }
}

class ElectronicsProduct extends Product {
    private String brand;
    private boolean hasWarranty;

    public ElectronicsProduct(String name, double price, String brand, boolean hasWarranty) {
        super(name, price);
        this.brand = brand;
        this.hasWarranty = hasWarranty;
    }

    public String getDescription() {
        return "Brand: " + brand + ", Warranty: " + (hasWarranty ? "Yes" : "No");
    }
}

class ClothingProduct extends Product {
    private String size;
    private String material;

    public ClothingProduct(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public String getDescription() {
        return "Size: " + size + ", Material: " + material;
    }
}

class BookProduct extends Product {
    private String author;
    private int pageCount;

    public BookProduct(String name, double price, String author, int pageCount) {
        super(name, price);
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getDescription() {
        return "Author: " + author + ", Pages: " + pageCount;
    }
}

class ShoppingCart {
    private Product[] products;
    private int productCount;

    public ShoppingCart(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }
    }

    public void displayCartDetails() {
        System.out.println("Shopping Cart Details:");
        for (int i = 0; i < productCount; i++) {
            products[i].displayProductDetails();
            System.out.println();
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
}

// Main class to test the functionality
public class ShoppingSystem {
    public static void main(String[] args) {
        Product laptop = new ElectronicsProduct("Fan", 799.99, "Usha", true);
        Product tshirt = new ClothingProduct("Red shirt", 19.49, "L", "Cotton");
        Product book = new BookProduct("Maths book", 39.96, "Ramanujam", 350);

        ShoppingCart cart = new ShoppingCart(5);
        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(book);

        cart.displayCartDetails();

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);
    }
}
