package homework;
import java.util.Scanner;
public class EX529 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int year=0,day=0;
	year=in.nextInt();
	int[]dayMonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	if(year%100==0&&year%400==0||year%100!=0&&year%4==0)
		dayMonth[1]=29;
	String[]str2= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	day=in.nextInt();
	in.close();
	
	for(int i=1;i<=12;i++) {
		
		switch(i) {
		case 1:System.out.printf("               January %d\n",year);break;
		case 2:System.out.printf("               February %d\n",year);break;
		case 3:System.out.printf("               March %d\n",year);break;
		case 4:System.out.printf("               April %d\n",year);break;
		case 5:System.out.printf("               May %d\n",year);break;
		case 6:System.out.printf("               June %d\n",year);break;
		case 7:System.out.printf("               July %d\n",year);break;
		case 8:System.out.printf("               August %d\n",year);break;
		case 9:System.out.printf("               September %d\n",year);break;
		case 10:System.out.printf("               October %d\n",year);break;
		case 11:System.out.printf("               November %d\n",year);break;
		case 12:System.out.printf("               December %d\n",year);break;
		}
		
		System.out.println("_______________________________________");
		
		for(int j=0;j<7;j++) {
			System.out.print(str2[j]+"   ");
		}
		System.out.println();
		for(int j=1;j<=day;j++) {
			System.out.print("      ");
		}
		for(int k=1;k<=dayMonth[i];k++) {
			System.out.printf("%-6d",k);
			day=(day+1)%7;
			if(day==0)
				System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	}

}
