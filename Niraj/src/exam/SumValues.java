package exam;

public class SumValues {
	  static int a[] = {7,9,99,999999,99999,9999,999}; 
      
	     
	     static int sum() 
	     { 
	         int sum = 0; 
	         int i; 
	        
	         
	         for (i = 0; i < a.length; i++) 
	            sum +=  a[i]; 
	        
	         return sum; 
	     } 
	       
	    
	     public static void main(String[] args)  
	     { 
	         System.out.println("Sum of given array is " + sum()); 
	        } 
	 } 


