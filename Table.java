package numberSystem;

import java.util.Scanner;

public class Table {
	static void getTable(int num) {
		for(int i =1;i<=10;i++) {
		System.out.println( num+" * "+i+" => "+ num*i);
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a num ");
	int num = sc.nextInt();
	getTable(num);
	sc.close();
}
}
