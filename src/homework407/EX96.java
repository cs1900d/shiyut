package homework407;
import java.util.Date;
public class EX96 {
	public static void main(String[] args) {
	    StopWatch sw = new StopWatch();
	    int[] a = new int[100001];
	    for(int i = 1; i <= 100000; i++) {
	    	a[i] = i;
	    }
	    sw.start();
	    for(int i = 1; i <=100000; i++) {
	    	for(int j = i + 1; j <= 100000; j++) {
	    		if(a[i] > a[j]) {
	    			int temp = a[i];
	    			a[i] = a[j];
	    			a[j] = temp;
	    		}
	    	}
	    }
	    sw.stop();
	    System.out.println(sw.getElapsedTime());
	}
}
class StopWatch {
	private long stratTime, endTime;
	public StopWatch() {
		Date date = new Date();
		stratTime = date.getTime();
	}
	public void start() {
		Date currentDate = new Date();
		stratTime = currentDate.getTime();
	}
	public void stop() {
		Date endDate = new Date();
		endTime = endDate.getTime();
	}
	long getElapsedTime() {
		return endTime - stratTime;
	}
}