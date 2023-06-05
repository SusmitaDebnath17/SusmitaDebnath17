package numberSystem;

import java.util.Scanner;
//enter num 5 120;


public class FactorialNum {
	static int getFact(int num) {
		int fact = 1;
		while(num>1) {
			fact = fact*num;
			num--;
			}
		return fact;
		}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int num = sc.nextInt();
	int result = getFact(num);
	System.out.println(result);
	sc.close();

	}

}
