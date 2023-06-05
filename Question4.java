package stringProgram;

import java.util.Scanner;
public class Question4 {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a string");
 String str = sc.nextLine();
 int capOvel=0;
 for(int i=0;i<str.length();i++) {
	 char ch = str.charAt(i);
	 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		 capOvel++;
		  }
     }
 System.out.println(" number of capovals => "+capOvel);
	sc.close();
}
}
