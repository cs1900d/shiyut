package homework;
import java.util.Scanner;
public class EX538 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int ten=0;
		ten=in.nextInt();
		int[]eight=new int[20];
		in.close();
		
		int i=0;
		for(i=0;ten>0;i++) {
			eight[i]=ten%8;
			ten=ten/8;
		}
		
	    for(int j=i-1;j>=0;j--) {
	    	System.out.print(eight[j]+" ");
	    }
	    

	}

}
