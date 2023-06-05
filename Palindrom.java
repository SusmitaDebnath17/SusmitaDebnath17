package numberSystem;

import java.util.Scanner;
//545 => is palindrome
public class Palindrom {
	static void isPalindrom(int num) {
		int rev=0;
		int temp=num;
		do {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
		}while(num!=0);
		if(rev == temp) {
			System.out.println(temp+" => is palindrom");
		}
		else {
			System.out.println(temp+" => not palindrom");
		}
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		isPalindrom(num);
		sc.close();

	}

}
