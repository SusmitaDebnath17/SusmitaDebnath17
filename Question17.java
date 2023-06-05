package stringProgram;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a string");
		  String str = sc.nextLine();
		  int smallOvals=0,specialCh=0,capCon=0;
		  for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if(ch>='a'&& ch<='z') {
				  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				  smallOvals++;
				  
			  }
			  if(ch>='A'&&ch<='Z') {
				  if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')==false)
					  capCon++;
				  }
				  
			  
			  if((ch>='A'&&ch<='Z'||ch>='a'&& ch<='z'||ch>='0'&&ch<='9')==false) {
				  specialCh++;
				  
			  }
		  }
	
		  System.out.println("smallovals letters are => "+smallOvals);
		  System.out.println("capital consonents letters are => "+capCon);
		  System.out.println("Special Character are => "+specialCh);
		  sc.close();
	}

}
