package numberSystem;

import java.util.Scanner;

public class GCDOfANum {
	static int getGCD(int num1,int num2) {
		int gcd =1;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
			}
			}
		return gcd;
	}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num1");
    int num1=sc.nextInt();
    System.out.println("enter num2");
    int num2 = sc.nextInt();
    int gcd = getGCD(num1,num2);
    System.out.println("GCD => "+gcd);
    sc.close();
	}
    }
