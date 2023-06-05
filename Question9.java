package stringProgram;


import java.util.Scanner;

public class Question9 {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String str = sc.nextLine();
	int smallVow=0,smallCons=0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>='a'&& ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				smallVow++;
			else
				smallCons++;
		}
	}
	System.out.println("small vowel => "+smallVow);
	System.out.println("small consonent => "+smallCons);
	sc.close();

	
}

}
