package arrayProgram;

import java.util.Scanner;

public class ShiftZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int s = sc.nextInt();
		int[]ar = new int[s];
		System.out.println("enter array element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int[]br = new int[s];
		int x=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				br[x]=ar[i];
				x++;
			}
		}
			while(x<s) {
				br[x]=0;
				x++;
			
			}
		for(int i=0;i<br.length;i++) {
			System.out.print(br[i]+" ");
		}
		sc.close();

	}

}
