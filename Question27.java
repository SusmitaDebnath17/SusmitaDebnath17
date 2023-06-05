package arrayProgram;

import java.util.Scanner;

public class Question27 {
	static int[]margeArr(int[]ar1,int[]ar2){
		int []cr = new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length&&j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				cr[k]=ar1[i];
				i++;
			}
			else {
				cr[k]=ar2[j];
				j++;
			}
			k++;
		}
		while(i<ar1.length) {
			cr[k]=ar1[i];
			k++;
			i++;
		}
		while(j<ar2.length) {
			cr[k]=ar2[j];
			j++;
			k++;
		}
		return cr;
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
    System.out.println("enter array size2");
    int size2= sc.nextInt();
    int[]ar2=new int[size2];
    System.out.println("enter array element2");
    for(int i=0;i<ar2.length;i++) {
    	ar2[i]=sc.nextInt();
    }
    int[]x=margeArr(ar1,ar2);
    for(int i=0;i<x.length;i++) {
    	System.out.print(x[i]+" ");
    }
    sc.close();
    
	}

}
