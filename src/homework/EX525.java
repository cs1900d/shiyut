package homework;

public class EX525 {

	public static void main(String[] args) {
    int i=0,j=0;
    double pi=0;
    for(i=1;i<=10;i++) {
    	for(j=1;j<=i*10000;j++) {
    		pi+=4.0*Math.pow(-1,j+1)/(2*j-1);
    	}
    	System.out.println(i*10000+":"+pi);
    	pi=0;
    }
	}

}
