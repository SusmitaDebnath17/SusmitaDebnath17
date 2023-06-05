package numberSystem;

import java.util.Scanner;

public class CharToAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		int asciiVal = ch;
		System.out.println("ascii value of "+ch+" is => "+asciiVal);
		sc.close();

		

	}

}
