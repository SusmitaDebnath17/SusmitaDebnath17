package basicProj;

import java.util.Scanner;

public class BiggestNum1 {
	static void isBig(int num1,int num2,int num3) {
		int big = num1;
		if(num2>big) {
			big=num2;
			System.out.println(num2+" is biggest one");
		}
		else if(num3>big) {
			big =num3;
			System.out.println(num3+" is biggest");
		}
		else {
			System.out.println(num1+" is biggest");
		}
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num1");
    int num1 = sc.nextInt();
    System.out.println("enter num2");
    int num2 = sc.nextInt();
    System.out.println("enter num3");
    int num3 = sc.nextInt();
    isBig(num1,num2,num3);
    sc.close();
}
}
