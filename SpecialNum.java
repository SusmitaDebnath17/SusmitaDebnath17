package basicProj;

import java.util.Scanner;

public class SpecialNum {
	static void isSpecial(int num) {
		int d1 = num/10;
		int d2 = num%10;
		int sum = d1+d2+(d1*d2);
		if(sum==num) {
			System.out.println("it's a special num");
		}
		else {
			System.out.println("not a special number");
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num = sc.nextInt();
	isSpecial(num);
	sc.close();
	}
}
