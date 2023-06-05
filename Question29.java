package arrayProgram;

import java.util.Scanner;

public class Question29 {
	static int sumOfDigit(int x) {
		int sum=0;
		do {
			int d= x%10;
			sum = sum+d;
			x=x/10;
		}while(x!=0);
		return sum;
	}
	static boolean isMagic(int n) {
		while(n>9) {
			n=sumOfDigit(n);
		}
		return n==1;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array size");
    int size1= sc.nextInt();
    int[]ar1=new int[size1];
    System.out.println("enter array element");
    for(int i=0;i<ar1.length;i++) {
    	ar1[i]=sc.nextInt();
    }
    for(int i=0;i<ar1.length;i++) {
    	boolean rs = isMagic(ar1[i]);
    	if(rs==true)
    		System.out.print(ar1[i]+" ");
    	
    }
    sc.close();

	}

}
