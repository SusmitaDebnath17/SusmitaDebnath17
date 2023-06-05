package basicProj;

import java.util.Scanner;

public class CircleCal {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter redious");
	double r = sc.nextDouble();
	double area = 3.14*r*r;
	double circumference = 2*3.14*r;
	System.out.println("area of circle => "+ area);
	System.out.println("circumference of circle => "+circumference);
	
sc.close();
}

}
