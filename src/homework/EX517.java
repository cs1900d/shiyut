package homework;
import java.util.Scanner;
public class EX517 {

	public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("输入一个0-15的整数：");
      int sum=input.nextInt();
      for(int i=1;i<=sum;i++) {
          for(int j=sum;j>=1;j--) {
        	  if(j>i) {
        	  System.out.print("  ");}
        	  if(j<=i) {
        	  System.out.print(j+" ");
        	  }
          }
          for(int j=sum+1;j<=sum*2-1;j++) {
        	  if(j-sum>=i) {
        	  System.out.print("  ");}
        	  if(j-sum<i) {
        	  System.out.print((j-sum+1)+" ");
        	  }
          }
          System.out.println();
      }
      input.close();
	}

}
