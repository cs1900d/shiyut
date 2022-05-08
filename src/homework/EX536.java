package homework;
import java.util.Scanner;
public class EX536 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int[]arr=new int[10];
    int sum=0,n=0;
    n=in.nextInt();
    for(int i=8;i>=0;i--) {
    	arr[i]=n%10;
    	n/=10;
    }
    in.close();
    
    for(int i=0;i<10;i++) {
    	sum+=arr[i]*(i+1);
    }
    arr[9]=sum%11;
    
    System.out.print("The IBSN-10 number is ");
    for(int i=0;i<9;i++) {
    	System.out.print(arr[i]);
    }
    if(arr[9]==10)
    	System.out.print("X");
    else
    	System.out.print(arr[9]);
	}

}
