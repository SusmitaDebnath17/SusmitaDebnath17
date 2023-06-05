package arrayProgram;

import java.util.Scanner;

public class Question31 {
	static int findIndex(int[]ar,int ele) {
		if(ar==null)
			return -1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele)
				return i;
		}
		return -1;
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
	    System.out.println("enter element");
	    int ele = sc.nextInt();
	    int x =findIndex(ar1,ele);
	    System.out.println("index of "+ele+"is => "+x);
	    sc.close();

	}

}
