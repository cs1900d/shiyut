package homework331;

public class EX97 {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+EX96.numberOfObjects);
		
		EX96 c1=new EX96();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		
		EX96 c2=new EX96(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2: radius ("+c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");

	}

}
