package arrayProgram;

public class MissingEle {
	static int missingNum(int []ar) {
		int n=ar.length+1;
		int sum = n*(n+1)/2;
		int sum2 = 0;
		for(int i=0;i<ar.length;i++) {
			sum2=sum2+ar[i];
		}
		int missingN=sum-sum2;
		return missingN;
	}

	public static void main(String[] args) {
//		char [] ch = {'a','b','d','e'};
//		for(int i=0;i<ch.length;i++) {
//			char x = ch.charAt(i + 1);
//	        char y = ch.charAt(i);
//	            if ((x - y) != 1) {
//	                return (ch.charAt[i] + 1);
//	            }
//		}
		int []ar= {1,3,4,5,6};
		int x=missingNum(ar);
		System.out.println(x);

	}

}
