package stringProgram;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a string");
		  String str = sc.nextLine();
		  int letter=0,digit=0;
		  for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if(ch>='a'&& ch<='z') {
				  letter++;
				  
			  }
			  if(ch>='0'&&ch<='9') {
				  digit++;
				  
			  }
	}
		  System.out.println("Small letters are => "+letter);
		  System.out.println("digits are => "+digit);
		  sc.close();
	}

}
