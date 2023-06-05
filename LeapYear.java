package basicProj;

import java.util.Scanner;

public class LeapYear {
	static void checkYear(int year) {
		if((year%4==0||year%400==0)&&year%100!=0)
			System.out.println("yes!!!!it is leap year");
		else
			System.out.println("nope.....it not a leap year");
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter year");
    int year = sc.nextInt();
    checkYear(year);
    sc.close();
	}

}
