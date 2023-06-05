package stringProgram;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a string");
	  String str = sc.nextLine();
	  int capCount=0;
	  for(int i=0;i<str.length();i++) {
		  char ch = str.charAt(i);
		  if(ch>='A'&&ch<='Z') {
			  capCount++;
			  
		  }
	  }
	  System.out.println("capital letter is => "+capCount);
	  sc.close();
  
	}

}
