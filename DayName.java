package basicProj;

import java.util.Scanner;

public class DayName {
	static void dayNum(int num) {
		if(num==1) {
			System.out.println("it'sunday");
		}
		else if(num==2)
			System.out.println("it's monday");
		else if(num==3)
			System.out.println("it's tuesday");
		else if(num==4)
			System.out.println("it's wednesday");
		else if(num==5)
			System.out.println("it's thusday");
		else if(num==6)
			System.out.println("it's friday");
		else
			System.out.println("it's satureday");
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    dayNum(num);
    sc.close();
	}

}
