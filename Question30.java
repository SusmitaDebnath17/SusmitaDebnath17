package arrayProgram;

import java.util.Scanner;

public class Question30 {
	static void printFrequency(int[]ar) {
		int big =ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		int count[]= new int[big+1];
		for(int i=0;i<ar.length;i++) {
			count[ar[i]]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0)
				System.out.println(i+" count"+count[i]);
		}
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
	    printFrequency(ar1);
	    sc.close();

	}

}
