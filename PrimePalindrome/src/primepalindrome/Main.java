// This finds the number that has properties of both prime and palindrome
package primepalindrome;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Tareq
 */

public class Main {
    
    private int targetNumber;

    public Main(int targetNumber) {
        int prime = this.targetNumber = targetNumber;
        
        System.out.println(primeCheck(prime));
      
    }
    
    // Findouts the prime numbers
    public static String primeCheck(int primeNumber){
		int divisor = 0;
		boolean isPrime = true;
		
		for(;primeNumber >=2 ; primeNumber--){
			isPrime = true;
			
			for(divisor = primeNumber - 1; divisor >= 2 ; divisor--){
                            if(primeNumber % divisor == 0){
				isPrime = false;
                            }
                        }
			
			if (true == isPrime){
                            if("Palindrome".equals(checkPalindrome(primeNumber)))
                            break;
			}
		}
		
                return (primeNumber + "");
    }

    // Checks if the prime number has the palindrome property  
    public static String checkPalindrome(int primeNUmber){

        String choice = primeNUmber+"";
        
        StringTokenizer st = new StringTokenizer(choice);

            char[] palindrome = choice.toCharArray();
            int round;
            int round1 = palindrome.length;
            boolean isPalindrome = true;

            for(round = 0; round<palindrome.length ; round++)
            {
                if (palindrome[round] != palindrome[round1-1])
                {
                    isPalindrome = false;
                }
                round1--;
            }

            if (isPalindrome == true)
                choice = "Palindrome";
            else if (isPalindrome == false)
                choice =  "Not Palindrome";
            
                return choice;

            }
    
    public static void main(String[] args) {
        
       new Main(1000);
    }
    
}
