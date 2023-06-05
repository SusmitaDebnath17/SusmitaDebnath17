package numberSystem;

import java.util.Scanner;

public class PermuAndComb {
	static int getFact(int num) {
		int fact=1;
		while(num>0) {
			fact= fact*num;
			num--;
		}
		return fact;
	}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("n => ");
    int n=sc.nextInt();
    System.out.println("r => ");
    int r = sc.nextInt();
    int sub= n-r;
    int NCR = getFact(n)/(getFact(sub)*getFact(r));
    int NPR = getFact(n)/getFact(sub);
    System.out.println("NCR => "+NCR);
    System.out.println("NPR => "+NPR);
    sc.close();
    }
	}
