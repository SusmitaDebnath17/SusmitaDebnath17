package stringProgram;


import java.util.Scanner;

public class Question8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(" Enter A String ");
String str = sc.nextLine();
int capVow=0,capCon=0;
for(int i=0;i<str.length();i++) {
	char ch = str.charAt(i);
	if(ch>='A'&& ch<='Z') {
	   if(ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O')
		capVow++;
	   else 
		capCon++;
}
}
System.out.println("capital vowels => "+capVow);
System.out.println("Capital consonent => "+capCon);
sc.close();
	}
}
