package stringProgram;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a string");
		  String str = sc.nextLine();
		  int  specialCh=0,digit=0;
		  for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if((ch>='A'&&ch<='Z'||ch>='a'&& ch<='z'||ch>='0'&&ch<='9')==false) {
				  specialCh++;
				  
			  }
			  if(ch>='0'&&ch<='9') {
				  digit++;
				  
			  }
	}
		  System.out.println(" special Charecter are => "+ specialCh);
		  System.out.println("digits are => "+digit);
		  sc.close();

	}

}
