package homework317;
import java.util.Scanner;
public class EX73 {

	public static void main(String[] args) {
	System.out.println("Enter the integers between 1 and 100 :");
	
	Scanner input=new Scanner(System.in);
	int[]arr=new int[101];
	int i=0;
	while((i=input.nextInt())!=0) {
		arr[i]++;
	}
	
	for(int j=1;j<=100;j++) {
		if(arr[j]==1)
			System.out.println(j+" occurs "+arr[j]+" time");
		else if(arr[j]>1)
			System.out.println(j+" occurs "+arr[j]+" times");
	}
	
	input.close();
	}
}
