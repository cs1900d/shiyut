package homework331;

public class EX911 {

	public static void main(String[] args) {
		EX98[] circleArray;
		
		circleArray=createCircleArray();
		
		printCircleArray(circleArray);

	}
	public static EX98[] createCircleArray() {
		EX98[] circleArray=new EX98[5];
		
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new EX98(Math.random()*100);
		}
		return circleArray;
	}
	
	public static void printCircleArray(EX98[] circleArray) {
		System.out.printf("%-30s%-15s\n","radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("----------------------------");
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
    public static double sum(EX98[] circleArray) {
    	double sum=0;
    	for(int i=0;i<circleArray.length;i++) {
    		sum+=circleArray[i].getArea();
    	}
    	return sum;
    }
}
