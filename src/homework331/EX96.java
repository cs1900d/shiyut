package homework331;

public class EX96 {
    double radius;
    
    static int numberOfObjects=0;
    
    EX96(){
    	radius=1;
    	numberOfObjects++;
    }
    EX96(double newRadius){
    	radius=newRadius;
    	numberOfObjects++;
    }
    static int getNumberOfObjects() {
    	return numberOfObjects;
    }
    double getArea() {
    	return radius*radius*Math.PI;
    }
}
