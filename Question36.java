package arrayProgram;

import java.util.Scanner;

public class Question36 {
static int[]arrengeOddEven(int[]ar){
	int []br=new int[ar.length];
	for(int i=0;i<ar.length-1;i++) {
		if(ar[i]%2!=0) {
			br[i]=ar[i];
		}
		else if(ar[i]%2==0){
			br[i+1]=ar[i];
		}
	 }
	return br;
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
	    int []x=arrengeOddEven(ar1);
	    for(int i=0;i<x.length;i++) {
	    	System.out.println(x[i]+" ");
	    }
	    sc.close();

	}

}
