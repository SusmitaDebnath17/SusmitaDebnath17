package stringProgram;

import java.util.Scanner;

public class Question10 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String str = sc.nextLine();
	int smallVow=0,capCons=0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>='A'&&ch<='Z') {
			if(ch>='a'&&ch<='z') {
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				smallVow++;
			}
			else
				capCons++;
		}
	}
	System.out.println("small vowels = > "+smallVow);
	System.out.println("cap cons => "+capCons);
	sc.close();

	}

}
