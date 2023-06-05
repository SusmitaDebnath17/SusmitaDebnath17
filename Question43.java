package numberSystem;

import java.util.Scanner;

public class Question43 {
	static int countDigit(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	static int pow(int n,int p) {
		int prod =1;
		while(p>0) {
			prod = prod*n;
			p--;
		}
		return prod;
	}
	static boolean IsDiserium(int n) {
		int dc = countDigit(n);
		int sum=0;
		int temp=n;
		do {
			int d = n%10;
			sum=sum+pow(d,dc);
			dc--;
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
boolean rs = IsDiserium(num);
if(rs==true) {
	System.out.println("Diserium number ");
}
else {
	System.out.println("not a Diserium number");
}
sc.close();
	}

}
