package arrayProgram;

import java.util.Scanner;

public class Question24 {
	static int []deleteEle(int[]ar,int in)
	{
		if(in<0||in>ar.length) {
			System.out.println("out of renge");
			return ar;
		}
		int []br = new int[ar.length-1];
		for(int i=0;i<ar.length-1;i++) {
			if(i<in)
				br[i]= ar[i];
			else
				br[i]=ar[i-1];
		}
		return br;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size");
		int s = sc.nextInt();
		int []ar=new int[s];
		System.out.println("enter array element");
		for(int i=0;i<ar.length;i++) {
			ar[i]= sc.nextInt();
		}
		System.out.println("index => ");
		int in = sc.nextInt();
		int []x = deleteEle(ar,in);
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		sc.close();

	}

}
