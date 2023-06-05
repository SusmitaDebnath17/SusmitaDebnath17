package numberSystem;

import java.util.Scanner;

//2 3 5 7 11 13 17 19 output

public class PrimeNum {
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
		if(num%2==0) {
			return false;
		}}
		return true;
		}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		for(int i=2;i<=num;i++) {
			boolean rs = isPrime(i);
			if(rs==true) {
				System.out.println(i+" ");
				sc.close();
			}
		}

	}

}
