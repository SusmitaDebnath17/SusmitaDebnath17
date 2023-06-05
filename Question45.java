package numberSystem;

import java.util.Scanner;

public class Question45 {
	static int power(int n,int p) {
		int prod =1;
		while(p>0) {
			prod=prod*n;
			p--;
			
		}
		return prod;
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("insert number");
int num = sc.nextInt();
System.out.println("insert power");
int pow = sc.nextInt();
int x = power(num,pow);
System.out.println(num+" power to "+pow+" is => "+x+" ");
sc.close();
	}

}
