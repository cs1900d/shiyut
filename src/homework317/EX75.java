package homework317;
import java.util.Scanner;
public class EX75 {

	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.print("Enter 10 numbers: ");
	
	int[]arr=new int[110];
	int[]array=new int [11];
	int i=0;
	int x=0;
	for(i=1;i<=10;i++) {
		x=in.nextInt();
		arr[x]++;
		if(arr[x]==1)
			array[i]=x;
	}
    
	int sum=0;
	for(i=1;i<=100;i++) {
		if(arr[i]>0)
			sum++;
	}
	System.out.printf("The number of distinct numbers is: %d\n",sum);
	
	System.out.print("The distinct numbers are: ");
	for(int k=1;k<=10;k++) {
		if(array[k]>0) {
		System.out.print(array[k]+" ");
	}
	}
	}
}
