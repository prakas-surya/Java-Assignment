package assignment;

abstract class Shape {
	String color;
	
	Shape(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public void displayColor() {
		System.out.println("Color: " + color);
	}
}

class Circle extends Shape {
	double radius;
	
	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }
}

public class GeometricShape {

	public static void main(String[] args) {
		Shape circle = new Circle("Red", 5);
		Shape rectangle = new Rectangle("Blue", 4, 7);
		Shape triangle = new Triangle("Yellow", 2, 3, 4);
		
		System.out.println("Details of Circle : ");
        circle.displayColor();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();
        System.out.println("Details of Rectangle : ");
        rectangle.displayColor();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();
        System.out.println("Details of Triangle");
        triangle.displayColor();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

	}

}
