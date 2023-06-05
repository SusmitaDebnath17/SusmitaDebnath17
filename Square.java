package basicProj;

import java.util.Scanner;

public class Square {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter side");
	int side = sc.nextInt();
	int area = side*side;
	int peri = 4*side;
	System.out.println("area of square => "+area);
	System.out.println("perimeter of square => "+peri);
	sc.close();
}
}
