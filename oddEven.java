package basicProj;

import java.util.Scanner;

public class oddEven {
	static void isOddEven(int num) {
		if(num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
    int num=sc.nextInt();
    isOddEven(num);
    sc.close();
}
}
