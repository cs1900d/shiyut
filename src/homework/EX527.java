package homework;

public class EX527 {

	public static void main(String[] args) {
    int i=0,sum=0;
    for(i=101;i<=2100;i++) {
    	if((i%100==0&&i%400==0)||(i%100!=0&&i%4==0)) {
    		sum+=1;
    		System.out.print(i+" ");
    		if(sum%10==0)
    			System.out.println();
    	}
    }
    System.out.println();
    System.out.println("闰年的总数为："+sum);
	}

}
