package homework414;

public class EX117 {

	public static void main(String[] args) {
		Object object1=new Circle(1);
		Object object2=new Rectangle(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if(object instanceof Circle) {
			System.out.println("The circle area is "+((Circle)object).getArea());
			System.out.println("The circle diameter is "+((Circle)object).getdiameter());
		}
		else if(object instanceof Rectangle) {
			System.out.println("The rectangle area is "+((Rectangle)object).getArea());
		}
	}

}
