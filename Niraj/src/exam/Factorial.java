package exam;

import java.util.Scanner;

public class Factorial {
	
	    static int fact(int n){
	        if(n == 0)
	            return 1;
	        else
	            return(n * fact(n-1));
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Number: ");
	        int num = scanner.nextInt();
	        int facti = fact(num);

	        System.out.println("Factorial= "+facti);
	    }
	}
