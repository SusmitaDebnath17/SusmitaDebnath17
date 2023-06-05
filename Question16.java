package stringProgram;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a string");
		  String str = sc.nextLine();
		  int capOvals=0,specialCh=0,smallCon=0;
		  for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if(ch>='A'&& ch<='Z') {
				  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				  capOvals++;
				  
			  }
			  if(ch>='a'&&ch<='z') {
				  if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')==false)
					  smallCon++;
				  }
				  
			  
			  if((ch>='A'&&ch<='Z'||ch>='a'&& ch<='z'||ch>='0'&&ch<='9')==false) {
				  specialCh++;
				  
			  }
		  }
	
		  System.out.println("capital ovals are => "+capOvals);
		  System.out.println("Small consonents are => "+smallCon);
		  System.out.println("Special Character are => "+specialCh);
		  sc.close();
	}

}
