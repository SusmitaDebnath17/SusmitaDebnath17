package arrayProgram;

import java.util.Scanner;

public class Question_21 {
	static void rev(int[]ar) {
		int i=0,j=ar.length-1;
		while(i<j) {
			int temp =ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter array size");
int n= sc.nextInt();
int[]ar= new int[n];
System.out.println("enter array element");
for(int i=0;i<ar.length;i++) {
	ar[i]=sc.nextInt();
	}
rev(ar);
for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]+" ");
}
sc.close();
}
	}
