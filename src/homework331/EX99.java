package homework331;

public class EX99 {

	public static void main(String[] args) {
		EX98 myCircle=new EX98(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
        
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		System.out.println("The number of objects created is "+EX98.getNumberOfObjects());
	}

}
