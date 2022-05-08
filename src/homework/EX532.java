
public class EX532 {

	public static void main(String[] args) {
		int a,b;
		a=(int)(Math.random()*100);
        b=(int)(Math.random()*100);
        while(a==b) {
        	b=(int)(Math.random()*100);
        }
        System.out.println(a+" "+b);
	}

}
