package homework;

public class EX533 {

	public static void main(String[] args) {
		int[]arr=new int[10000];
		int i=0,j=0,sum=0,count=0;
		for( i=2;i<=10000;i++) {
			for( j=1;j<i;j++) {
				if(i%j==0) {
					arr[count]=j;
					count++;
					}
			}
			for(int k=0;k<=count-1;k++) {
				sum+=arr[k];
			}
			if(sum==i)
				System.out.print(sum+" ");
			sum=0;
			count=0;
		}

	}

}
