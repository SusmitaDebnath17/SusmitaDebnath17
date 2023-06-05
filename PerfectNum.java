package numberSystem;
import java.util.Scanner;
public class PerfectNum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	int sum = 0;
	for(int i=1;i<=num/2;i++) {
		if(num%i==0) {
		   sum=sum+i;
			}}
	if(sum==num) {
		System.out.println("perfect number");
	}
	else
	{
		System.out.println("not perfect number");
	}
	sc.close();
}
}