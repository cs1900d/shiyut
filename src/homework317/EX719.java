package homework317;
import java.util.Scanner;
public class EX719 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size=in.nextInt();
		
		System.out.print("Enter the contents of the list: ");
		int[] arr=new int[101];
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		 in.close();
	        
        System.out.printf("The list has %d integers ",size);
        for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
        System.out.println();
        
        int j=0;
        for(j=0;j<size-1;j++) {
			if(arr[j]>arr[j+1]) {
				System.out.println("The list is not sorted");
				break;
			}
		}
        if(j==size-1)
        	System.out.println("The list is already sorted");
        
	}

}
