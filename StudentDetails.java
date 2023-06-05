package basicProj;

import java.util.Scanner;

public class StudentDetails {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter student name");
	String name=sc.nextLine();
	System.out.println("enter ph number");
	long ph = sc.nextLong();
	System.out.println("enter 10th persentage");
	double perc1=sc.nextDouble();
	System.out.println("enter 12th persentage");
	double perc2=sc.nextDouble();
	System.out.println("enter degree persentage");
	double perc3=sc.nextDouble();
	System.out.println("student name is => "+name +" phone number =>"+ph +" 10th percentage=>"+perc1+" 12th percentage=>"+perc2+" degree percentage=>"+perc3);
sc.close();	
}
}
