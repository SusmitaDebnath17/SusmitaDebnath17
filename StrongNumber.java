package numberSystem;

import java.util.Scanner;

public class StrongNumber {
	static int getFact(int num) {
		int fact = 1;
		while(num>0) {
			fact = fact*num;
			num--;
		}
		return fact;
	}
	static boolean isStrong(int num) {
		int sum=0,temp=num;
		do {
			int d = num%10;
			sum= sum+ getFact(d);
			num= num/10;
		}while(num!=0);
		return(sum==temp);
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	boolean rs = isStrong(num);
	if(rs== true)
		System.out.println("this number is strong");
	else
		System.out.println("this number is not strong number");
	sc.close();

	}

}
