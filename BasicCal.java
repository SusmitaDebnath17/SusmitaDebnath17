package basicProj;

import java.util.Scanner;

public class BasicCal {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num1 ");
	int num1 = sc.nextInt();
	System.out.println(" enter num2 ");
	int num2 = sc.nextInt();
	int add = num1+num2;
	int sub = num1-num2;
	int multi = num1*num2;
	int div = num1/num2;
	System.out.println("addition => "+add);
	System.out.println("substruction => "+sub);
	System.out.println("multiplication => "+multi);
	System.out.println("divition => "+div);
	sc.close();
}
}
