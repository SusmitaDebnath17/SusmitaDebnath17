package stringProgram;


import java.util.Scanner;

public class Question7 {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A String");
	String str=sc.nextLine();
	int vowel=0,cons=0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>='A'&&ch<='Z') {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vowel++;
			else 
				cons++;
		}
		else if(ch>='a'&& ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowel++;
			else
				cons++;
		}
	}
	System.out.println("number vowels => "+vowel);
	System.out.println("number of consonent => "+cons);
	sc.close();
}
}
