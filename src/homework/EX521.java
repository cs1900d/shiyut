package homework;
import java.util.Scanner;
public class EX521 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=0,years=0;
		System.out.print("Loan Amount: ");
		amount=in.nextInt();
		System.out.print("Number of years: ");
		years=in.nextInt();
		in.close();
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		double monthlypayment=0,totalpayment=0;
		for(double i=5.000;i<=8.000;i+=0.125) {
			monthlypayment=amount*i/100/12/(1-1.0/Math.pow(1+i/100/12, years*12));
			totalpayment=monthlypayment*12*years;
			System.out.printf("%.3f%% %16.2f %20.2f",i,monthlypayment,totalpayment);
			System.out.println();
		}

	}

}
