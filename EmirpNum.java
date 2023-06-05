package numberSystem;

import java.util.Scanner;

public class EmirpNum {
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num = sc.nextInt();
	boolean rs = isPrime(num);
	int rev=0;
	do {
		int d=num%10;
		rev = rev*10+d;
		num= num/10;
		}while(num!=0);
	boolean rs1 = isPrime(rev);
	if(rs==true) {
		if(rs1==true) 
			System.out.println("emip");
		}
	else {
		System.out.println("not emip");
	}
	
sc.close();
	}

}
