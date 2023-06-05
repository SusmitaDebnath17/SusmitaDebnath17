package numberSystem;

import java.util.Scanner;

public class Question44 {
	static int sumOfDigit(int n) {
		int sum =0;
		do {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;
		}while(n!=0);
		return sum;
	}
	static boolean isHappy(int n) {
		while(n>9) {
			n=sumOfDigit(n);
		}
		return n==1||n==7;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x = sc.nextInt();
		boolean rs = isHappy(x);
		if(rs==true)
			System.out.println("happy number");
		else
			System.out.println("not an happy number");
		sc.close();

	}

}
