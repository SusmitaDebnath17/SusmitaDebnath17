package basicProj;

import java.util.Scanner;

public class CountMonth {
	static void count(int count) {
		if(count==1||count==3||count==5||count==7||count==8||count==10||count==12)
			System.out.println("31 days");
	
	else if(count==4||count==5||count==6||count==9||count==11)
		System.out.println("30 days");
	else if(count==2) 
		System.out.println("28 days");
	else
		System.out.println("invalid");
	
	}
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int count =sc.nextInt();
    count(count);
    sc.close();
	}

}
