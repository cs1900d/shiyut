package homework407;
import java.util.GregorianCalendar;
public class EX95 {

	public static void main(String[] args) {
		GregorianCalendar time=new GregorianCalendar();
        System.out.println(time.get(time.YEAR)+" "+time.get(time.MONTH)+" "+time.get(time.DAY_OF_MONTH));
        long i=1234567898765L;
        time.setTimeInMillis(i);
        System.out.println(time.get(time.YEAR)+" "+time.get(time.MONTH)+" "+time.get(time.DAY_OF_MONTH));
        
	}

}
