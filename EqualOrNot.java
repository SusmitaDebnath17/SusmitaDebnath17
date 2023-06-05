package basicProj;

import java.util.Scanner;

public class EqualOrNot {
	static void isEqual(int num1,int num2) {
		if(num1==num2) {
			System.out.println("two numbers are equal");
		}
		else {
			System.out.println("two number are not equal");
		}
	}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number1");
	int num1 = sc.nextInt();
	System.out.println("enter number2");
	int num2 = sc.nextInt();
	isEqual(num1,num2);
	sc.close();

}
}
