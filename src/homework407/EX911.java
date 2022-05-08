package homework407;
import java.util.Scanner;
public class EX911 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=0,b=0,c=0,d=0,e=0,f=0;
        System.out.print("Enter a, b, c: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        d=input.nextDouble();
        e=input.nextDouble();
        f=input.nextDouble();
        LinearEquation lin=new LinearEquation(a,b,c,d,e,f);
        if(lin.isSolvable()) {
        	System.out.println("x is "+lin.getX()+" y is "+lin.getY());
        }
        else
        	System.out.println("The equation has no solution.");
        input.close();
	}

}
class LinearEquation{
	private double a,b,c,d,e,f;
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
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
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		if(a*d-b*c!=0)
			return true;
		else 
			return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}
