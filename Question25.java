package arrayProgram;

import java.util.Scanner;

public class Question25 {
	static int[] insertArray(int[]ar,int[]arin,int index) {
		if(index<0||index>ar.length) {
			System.out.println("index not in renge");
			return ar;
		}
		int []br = new int[ar.length+arin.length];
		int temp=index;
		for(int i=0;i<arin.length;i++) {
			br[index]=arin[i];
			index++;
		}
		for(int i=0;i<ar.length;i++) {
			if(i<temp)
				br[i]=ar[i];
			else
				br[arin.length+i]=ar[i];
			
		}
		return br;
	}

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter size of first array");
  int size1 = sc.nextInt();
  int[]ar1 =new int[size1];
  System.out.println("enter array element");
  for(int i=0;i<ar1.length;i++) {
	  ar1[i]=sc.nextInt();
  }
	  System.out.println("enter size2");
	  int size2 = sc.nextInt();
	  int[]ar2= new int[size2];
	  System.out.println("enter array element");
	  for(int i=0;i<ar2.length;i++) {
		  ar2[i]=sc.nextInt();
		  
	  }
	  System.out.println("enter index");
	  int index = sc.nextInt();
	  int[]x=insertArray(ar1,ar2,index);
      for(int i=0;i<x.length;i++) {
    	  System.out.print(x[i]+" ");
	   }
      sc.close();
  }
}
