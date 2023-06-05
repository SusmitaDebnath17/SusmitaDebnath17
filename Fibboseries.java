package numberSystem;

import java.util.Scanner;
//0 1 1 2 3 5 8 13 =>output

public class Fibboseries {
	static void printFibbo(int num) {
		int f1=0,f2=1;
		while(f1<=num) {
			System.out.print(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	printFibbo(num);
	sc.close();
	

	}

}
