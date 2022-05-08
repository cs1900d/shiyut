import java.util.Scanner;
public class EX522 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in); 
	System.out.print("Loan Amount: ");
	double amount=input.nextInt();
    System.out.print("Number of Years: "); 
    int years=input.nextInt();
    System.out.print("Annual Interest Rate: ");
	double rate=input.nextInt();
    System.out.print("Monthly Payment: ");
    double monthlyPayment;
    monthlyPayment=(amount*(rate/1200)/(1-1/(Math.pow(1+rate/1200,years*12))));
    System.out.printf("%.2f\n",monthlyPayment);
    double totalPayment;
    totalPayment=years*12*monthlyPayment;
    System.out.printf("Total Payment: %.2f\n",totalPayment);
    System.out.println("Payment#\tInterest\tPrincipal\tBalance");
   double monthlyInterestRate=rate/1200;
   double balance=amount,interest,principal;
    for(int i=1;i<=years*12;i++) {
    	interest=monthlyInterestRate*balance;
    	principal=monthlyPayment-interest;
    	balance=balance-principal;
    	System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,balance);
    }
    input.close();
	}

}
