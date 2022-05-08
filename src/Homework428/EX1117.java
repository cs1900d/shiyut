package Homework428;
import java.util.Scanner;
public class EX1117 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an integer m: ");
    int number=input.nextInt();
    int m=1,k=number,count=0;
    for(int i=2;i<=number;i++) {
    	count=0;
    	if(number%i==0) {
    		while(number%i==0) {
    			count++;
    			number/=i;
    		}
    		if(count%2==1) {
    			m*=i;
    		}
    	}
    }
    System.out.println("The smallest number n for m * n to be a perfect square is "+m);
    System.out.println("m * n is "+k*m);
    input.close();
	}
}
