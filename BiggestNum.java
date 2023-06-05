package basicProj;

import java.util.Scanner;

public class BiggestNum {
	static void isBig(int num1,int num2) {
		int big=num1;
		if(num2>big) {
			big = num2;
			System.out.println("biggest one is => "+num2);
		}
	}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter num1");
int num1=sc.nextInt();
System.out.println("enter num2");
int num2 = sc.nextInt();
isBig(num1,num2);
sc.close();
}
}
