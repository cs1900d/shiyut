package Homework428;
import java.util.Scanner;
public class EX1116 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int[]arr=new int[100];
		int count=0;
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer=input.nextInt();
		arr[count]=answer;
		while(number1+number2!=answer) {
			System.out.print("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			answer=input.nextInt();
			count++;
			arr[count]=answer;
			for(int i=0;i<count;i++) {
				if(arr[count]==arr[i])
					System.out.println("You already entered "+arr[count]);
			}
		}
		System.out.println("You got it!");
		input.close();
	}

}
