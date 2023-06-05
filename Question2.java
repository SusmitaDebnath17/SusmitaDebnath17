package stringProgram;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter A String");
	String str = sc.nextLine();
	int Uc=0,Sc=0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>='A'&&ch<='Z')
			Uc++;
		else if(ch>='a'&&ch<='z')
			Sc++;
	}
	System.out.println("upperletter => "+Uc);
	System.out.println("lowerletter => "+Sc);
	sc.close();

	}

}
