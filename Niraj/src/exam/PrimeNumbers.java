package exam;

public class PrimeNumbers {
	
		   public static void main(String[] args) {
		        for(int i=2;i<=100;i++){
		            int state = 0;
		            for(int j=2;j<i;j++){
		                if(i%j == 0)
		                    state++;
		            }
		            if(state == 0){
		                System.out.print(i+", ");
		            }
		        }
		    }
		}

