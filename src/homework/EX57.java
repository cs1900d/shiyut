package homework;

public class EX57 {

	public static void main(String[] args) {
      double fee=0;
      double ratio=1.05;
      double sum=0;
      for(int i=1;i<10;i++) {
    	  ratio*=1.05;
      }
      fee=10000*ratio;
      System.out.println("十年后的学费：$");
      System.out.println(fee);
      for(int i=1;i<=4;i++) {
    	  fee=fee*1.05;
    	  sum+=fee;
      }
      
      System.out.println("十年后的4年总学费：$");
      System.out.println(sum);
	}

}
