package basicProj;

import java.util.Scanner;

public class Rectangle {
public static void main(String[] args)
{
	Scanner sc = new Scanner (System.in);
	System.out.println("enter length");
	int len = sc.nextInt();
	System.out.println("enter breath");
	int br = sc.nextInt();
	int area = len*br;
	int peri = 2*(len+br);
	System.out.println("area of a rectangle => "+area);
	System.out.println("perimeter of a rectangle => "+ peri);
sc.close();
}
}
