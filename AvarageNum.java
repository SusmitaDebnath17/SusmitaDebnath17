package numberSystem;

import java.util.Scanner;

public class AvarageNum {
	static int countDigit(int num) {
		int count =0;
		do {
			count++;
			num= num/10;
		}while(num!=0);
		return count;
	}
	static int getAvg(int num) {
		int sum=0,avg;
		int dc = countDigit(num);
		do {
			int d = num%10;
			sum = sum+d;
			avg= sum/dc;
			num = num/10;
			}while(num!=0);
		return avg;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	int avarage = getAvg(num);
	System.out.println("avarage is => "+avarage);
	sc.close();
}
}
