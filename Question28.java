package arrayProgram;

import java.util.Scanner;

public class Question28 {
	static void findComm(int[]ar1,int[]ar2){
		
		for(int i=0;i<ar1.length;i++) {
			for(int j=1;j<ar2.length;j++) {
				if(ar1[i]==ar2[j])
					System.out.print(ar1[i]+" ");
			}
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
	    System.out.println("enter array size2");
	    int size2= sc.nextInt();
	    int[]ar2=new int[size2];
	    System.out.println("enter array element2");
	    for(int i=0;i<ar2.length;i++) {
	    	ar2[i]=sc.nextInt();
	    }
	    findComm(ar1,ar2);
	    sc.close();
	    

	}

}
