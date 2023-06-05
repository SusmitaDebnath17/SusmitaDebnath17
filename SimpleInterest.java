package basicProj;

import java.util.Scanner;

public class SimpleInterest {
	static void simpleInterest(int amt,int rate,int time) {
		double SI = (amt*(1+(rate*time)/100));
		System.out.println("simple interest is => "+SI);
	}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter amount");
	int amt = sc.nextInt();
	System.out.println("enter rate");
	int rate = sc.nextInt();
	System.out.println("enter time ");
	int time = sc.nextInt();
	simpleInterest(amt,rate,time);
	sc.close();
}
}
