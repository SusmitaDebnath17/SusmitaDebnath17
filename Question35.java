package arrayProgram;

import java.util.Scanner;

public class Question35 {
	static void getBigSmall(int[]ar) {
		int temp;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		System.out.println(" biggest => "+ar[ar.length-1]);
		System.out.println("smallest => "+ar[0]);
	}

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	System.out.println("enter array size");
    int size1= sc.nextInt();
    int[]ar1=new int[size1];
    System.out.println("enter array element");
    for(int i=0;i<ar1.length;i++) {
    	ar1[i]=sc.nextInt();
    }
    getBigSmall(ar1);
    sc.close();
		}
}
