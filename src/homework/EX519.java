package homework;

public class EX519 {

	public static void main(String[] args) {
     for(int i=1;i<=8;i++) {
    	 int sum=1;
    	 for(int j=8;j>=1;j--) {
    		 if(j>i) {
    			 System.out.print("     ");
    		 }
    		 
    		 if(j<=i) {
    			 sum*=2;
    			 System.out.print(sum/2+"    ");
    		 }
    	 }
    	 for(int j=9;j<=15;j++) {
    		 if(j-8>=i) {
    			 System.out.print("     ");
    		 }
    		 
    		 if(j-8<i) {
    			 sum/=2;
    			 System.out.print(sum/2+"    ");
    		 }
    	 }
    	 System.out.println();
     }
	}

}
