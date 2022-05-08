package homework;
import java.util.Scanner;
public class EX528 {

	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int year=in.nextInt(),day=in.nextInt();
    in.close();
    String str1=null,str2=null;
    int month=0;
    for(month=1;month<=12;month++) {
    if(year%100==0&&year%400==0||year%100!=0&&year%4==0) {
    	day+=1;
    }
    switch(month) {
    case 1:str1="January 1";break;
    case 2:day+=28;str1="February 1";break;
    case 3:day+=31;str1="March 1";break;
    case 4:day+=30;str1="April 1";break;
    case 5:day+=31;str1="May 1";break;
    case 6:day+=30;str1="June 1";break;
    case 7:day+=31;str1="July 1";break;
    case 8:day+=31;str1="August 1";break;
    case 9:day+=30;str1="September 1";break;
    case 10:day+=31;str1="October 1";break;
    case 11:day+=30;str1="November 1";break;
    case 12:day+=31;str1="December 1";break;
    }
    switch(day%7) {
    case 0:str2="Sunday";break;
    case 1:str2="Monday";break;
    case 2:str2="Tusday";break;
    case 3:str2="Thirsday";break;
    case 4:str2="Thursday";break;
    case 5:str2="Friday";break;
    case 6:str2="Saturday";break;
    }
    System.out.println(str1+", "+year+" is "+str2);
    str1=null;
    str2=null;
	}
 
	}
}
