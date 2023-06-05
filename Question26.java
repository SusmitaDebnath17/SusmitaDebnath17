package arrayProgram;

import java.util.Scanner;

public class Question26 {
	static int[] zigzagArr(int[]ar,int[]br) {
		int[]cr = new int[ar.length+br.length];
		int i=0,j=0;
		while(i<ar.length&&i<br.length) {
			cr[j]=ar[i];
			j++;
			cr[j]=br[i];
			j++;
			i++;
		}
		while(i<ar.length) {
			cr[j]=ar[i];
			j++;
			i++;
		}
		while(i<br.length) {
			cr[j]=br[i];
			j++;
			i++;
		}
		return cr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size1 = sc.nextInt();
		int[]ar1= new int[size1];
		System.out.println("enter array element");
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("----------------------------");
		System.out.println("enter size2");
		int size2 = sc.nextInt();
		int[]ar2=new int[size2];
		System.out.println("enter array element");
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		
		int[]x= zigzagArr(ar1,ar2);
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		sc.close();

	}

}
