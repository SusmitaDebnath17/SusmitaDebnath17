package numberSystem;

import java.util.Scanner;

public class RaghuSir39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num= sc.nextInt();
		int sumOdd=0;
		int sumEven=0;
		do {
			int d = num%10;
			if(d%2==0)
				sumEven=sumEven+d;
			else
				sumOdd=sumOdd+d;
			num= num/10;
		}while(num!=0);
		int diff=sumOdd-sumEven;
		System.out.println("sum of odd => "+sumOdd);
		System.out.println("sum of even => "+sumEven);
		System.out.println("difference => "+diff);
		sc.close();
		}
}
