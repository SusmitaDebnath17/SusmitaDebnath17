package basicProj;

import java.util.Scanner;

public class CheckNum {
	static void isPositive(int num) {
		if(num<0) {
			System.out.println("number is negetive");
		}
		else if(num>0) {
			System.out.println("number positive");
			
		}
		else {
			System.out.println("number is zero");
		}
	}
	
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num = sc.nextInt();
	isPositive(num);
	sc.close();
}
}
