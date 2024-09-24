//if a class is present in java file, then compiler generates .class file to all classes;
//this .class file is byte code versions of classes...
public class MultipleClass {
	public static void main(String[] args) {
		System.out.println("calling class one and class two from Main method of public class");
		One one = new One();
		Two two = new Two();
		one.sayHello();
		two.sayWorld();
	}
}

class One {
	public void sayHello() {
		System.out.println("Hello ");
	}
}

class Two {
	public void sayWorld() {
		System.out.println("World!");
	}
}
