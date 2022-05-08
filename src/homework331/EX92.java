package homework331;

public class EX92 {

	public static void main(String[] args) {
		
		EX92 circle1=new EX92();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		
		EX92 circle2=new EX92(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		
		EX92 circle3=new EX92(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle2.getArea());
		
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
	
		double radius;
		
		EX92(){
			radius=1;
		}
		
		EX92(double newRadius){
			radius=newRadius;
		}
		
		double getArea() {
			return radius*radius*Math.PI;
		}
		
		double getPerimeter() {
			return 2*radius*Math.PI;
		}
		
		void setRadius(double newRadius) {
			radius=newRadius;
		}

}
