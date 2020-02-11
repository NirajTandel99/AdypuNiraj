package exam;

import java.util.Scanner;


public class VowelsConstant {
	void DemoCount(String str){
        char[] inp = str.toCharArray();
        int v=0;
        int c=0;

        for(int i=0; i<str.length(); i++){
            if(inp[i] == 'a' || inp[i] == 'e' || inp[i] == 'i' || inp[i] == 'o' || inp[i] == 'u'){
                v++;
            }
            else{
                c++;
            }
            
        }

        System.out.println("Vowels = "+v+" and Consonants = "+c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = scanner.next();

        VowelsConstant countVowels = new VowelsConstant();
        countVowels.DemoCount(str);
    }
}



