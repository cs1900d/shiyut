package homework331;

public class EX98 {
    private double radius;
    
    private static int numberOfObjects=0;
    
    EX98(){
    	numberOfObjects++;
    }
    public EX98(double newRadius){
    	radius=newRadius;
    	numberOfObjects++;
    }
    public double getRadius() {
    	return radius;
    }
    public void setRadius(double newRadius) {
    	radius=(newRadius>=0)?newRadius:0;
    }
    public static int getNumberOfObjects() {
    	return numberOfObjects;
    }
    public double getArea() {
    	return radius*radius*Math.PI;
}
}