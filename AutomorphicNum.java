package numberSystem;

import java.util.Scanner;

public class AutomorphicNum {
	static boolean isAutomorphic(int num) {
		int sqrt=num*num;
		while(num>0) {
			if(num%10!=sqrt%10)
				return false;
		    num=num/10;
			sqrt=sqrt/10;
		}
		return true;
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num = sc.nextInt();
	boolean rs = isAutomorphic(num);
	if(rs==true)
		System.out.println("Automorphic number");
	else
		System.out.println("not automorphic number");
	sc.close();
}
}
