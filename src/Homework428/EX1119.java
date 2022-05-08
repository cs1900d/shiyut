package Homework428;
import java.util.Scanner;
public class EX1119 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number of objects: ");
    int n=input.nextInt();
    int[]arr=new int[100];
    System.out.print("Enter the weight of the objects: ");
    for(int i=0;i<n;i++) {
    	arr[i]=input.nextInt();
    }
    
    for(int i=0;i<n-1;i++) {
    	for(int j=0;j<n-i-1;j++) {
    		int temp;
    		if(arr[j]>=arr[j+1]) {
    			temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    		}
    	}
    }
   
    int count=1,m=0;
    for(int i=n-1;i>=m;i--) {
    	System.out.print("Contatiner "+count+" contains objects with weight "+arr[i]+" ");
    	count++;
    	for(int j=m;j<i;j++) {
    	 if((arr[i]+arr[j])<=10) {
    		arr[i]+=arr[j]; 
    		m=j+1;
    		System.out.print(arr[j]+" ");
    	 }
    	}
    	System.out.println();
    }
    input.close();
	}
}
