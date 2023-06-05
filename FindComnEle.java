package arrayProgram;

import java.util.Scanner;

public class FindComnEle {
	static void commEle(int[]ar,int[]br){
	for(int i=0;i<ar.length;i++) {
			for(int j=0;j<br.length;j++) {
				if(ar[i]==br[j]) {
					System.out.println(ar[i]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter arr1 size");
		int s1 = sc.nextInt();
		System.out.println("enter arr2 size");
		int s2 = sc.nextInt();
		int []ar = new int[s1];
		int[]br = new int[s2];
		System.out.println("enter arr1 element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("enter arr2 element");
		for(int i=0;i<br.length;i++) {
			br[i]=sc.nextInt();
		}
		commEle(ar,br);
		sc.close();
		

	}

}
