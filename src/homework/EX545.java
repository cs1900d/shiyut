package homework;
import java.util.Scanner;
public class EX545 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter 10 numbers: ");
	double[]arr=new double[10];
	double[]array=new double[10];
    for(int i=0;i<10;i++) {
    	arr[i]=in.nextDouble();
    	array[i]=arr[i]*arr[i];
    }
    in.close();
    double sum1=0,sum2=0;
    for(int i=0;i<10;i++) {
    	sum1+=arr[i];
    	sum2+=array[i];
    	}
    System.out.printf("The mean is %.2f\n",sum1/10);
	double standardDevitation=0;
	standardDevitation=Math.sqrt((sum2-sum1*sum1/10)/(10-1));
	System.out.printf("The standard devitation is %.5f",standardDevitation);
}
}
