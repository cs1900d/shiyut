package homework407;
import java.util.Date;
public class EX93 {
	public static void main(String[] args) {
		Date date=new Date();
        for(long i=10000;i<=1e11;i*=10) {
        	date.setTime(i);
        	System.out.println(date.getTime());
        	System.out.println(date.toString());
        }
	}
	

}
