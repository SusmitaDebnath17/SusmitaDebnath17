package numberSystem;

import java.util.Scanner;

public class AmstrongNum { 
	static int countDigit(int num) {
		int count =0;
		do {
			count++;
			num= num/10;
			}while(num!=0);
		return count;
	}
	static int pow(int num,int pow) {
		int prod=1;
		while(pow>0) {
			prod = prod*num;
			pow--;
		}
		return prod;
	}
	static boolean isAmstrong(int num) {
		int sum =0,temp=num;
		int dc = countDigit(num);
		do {
			int d = num%10;
			sum= sum+pow(d,dc);
			num = num/10;
		}while(num!=0);
		return sum==temp;
	}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
boolean rs = isAmstrong(num);
if(rs==true)
	System.out.println("number is amstrong");
else
	System.out.println("number is not amstrong");
sc.close();
	}
}
