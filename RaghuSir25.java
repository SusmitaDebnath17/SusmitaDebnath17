package numberSystem;

import java.util.Scanner;

public class RaghuSir25 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    if(num%3==0&&num%5==0)
    	System.out.println("sanju weds geeta");
    else if(num%3==0) 
    	System.out.println("Sanju");
    else if(num%5==0)
    	System.out.println("geeta");
    else
    	System.out.println("break up");
    sc.close();
    
	}

}
