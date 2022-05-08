package homework331;

public class EX910 {

	public static void main(String[] args) {
		EX98 myCircle=new EX98(1);
		
		int n=5;
		printArea(myCircle,n);
		
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
	}
	
		public static void printArea(EX98 c,int times) {
			System.out.println("Radius \t\tArea");
			while(times>=1) {
				System.out.println(c.getRadius()+"\t\t"+c.getArea());
				c.setRadius(c.getRadius()+1);
				times--;
			}
		}

}
