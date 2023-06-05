package stringProgram;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a string");
		  String str = sc.nextLine();
		  int capOvals=0,smallCon=0;
		  for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if(ch>='A'&&ch<='Z') {
				  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					  capOvals++;
			 }
			  if(ch>='a'&&ch<='z') {
				  if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')==false)
					  smallCon++;
				  }
		  }
		  System.out.println("capital ovals are => "+capOvals);
		  System.out.println("samll consonents are => "+smallCon);
		  sc.close();

	}

}
