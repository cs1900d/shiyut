package homework407;
import java.util.Scanner;
public class EX910 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=0,b=0,c=0;
       System.out.println("Enter a, b, c: ");
       a=input.nextDouble();
       b=input.nextDouble();
       c=input.nextDouble();
       QuadraticEqularPolygon qua=new QuadraticEqularPolygon(a,b,c);
       System.out.println("The discriminant is "+qua.getDiscriminant());
       if(qua.getDiscriminant()>0)
    	   System.out.println("The equation has two roots "+qua.getRoot1()+" and "+qua.getRoot2());
       else if(qua.getDiscriminant()==0)
    	   System.out.println("The equation has one root "+qua.getRoot1());
       else
    	   System.out.println("The equation has no roots.");
       input.close();
	}

}
class QuadraticEqularPolygon{
	private double a,b,c;
	public QuadraticEqularPolygon(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	double getRoot1() {
		if(getDiscriminant()>=0)
			return (-b+Math.sqrt(getDiscriminant()))/2*a;
		else
			return 0;
	}
	double getRoot2() {
		if(getDiscriminant()>=0)
			return (-b-Math.sqrt(getDiscriminant()))/2*a;
		else
			return 0;
	}
}

