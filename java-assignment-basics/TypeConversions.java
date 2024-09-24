
public class TypeConversions {

	public static void main(String[] args) {
		//float to int - explicit casting
		float a = 6.78f;
		int b = (int) a;
		System.out.println("Float : " + a);
		System.out.println("Float converted to int : " + b);
		
		//double to float - explicit
		double d = 55.8989;
		float f = (float) d;
		System.out.println("Double : " + d);
		System.out.println("Double converted to float : " + f);
		
		//int to short - explicit
		int n = 10000;
		short s = (short) n;
		System.out.println("int : " + n);
		System.out.println("int converted to short : " + s);
		
		//int to long - implicit casting
		//from small data type to big data type no need explicit casting
		int x = 55;
		double y = x;
		System.out.println("int : " + x);
		System.out.println("int converted to double : " + y);
	}

}
