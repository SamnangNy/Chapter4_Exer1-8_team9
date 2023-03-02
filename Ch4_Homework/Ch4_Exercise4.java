/*

 Exercise4
 Write a method called 
generatePalindromicPrimes that displays the first 50 palindromic prime numbers.

*/

public class Ch4_Exercise4  {
    //Main Function
    public static void main(String[] args) {
        //Create array object of generatePalindromicPrimes 
        int[] palindromicPrimes = generatePalindromicPrimes(10);
            
        //for loop
        for (int i = 0; i < palindromicPrimes.length; i++) {
            System.out.print(palindromicPrimes[i] + " ");
            
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    //function for generate Primes passing by augment
    public static int[] generatePalindromicPrimes(int n) {
        int[] palindromicPrimes = new int[n]; //array
        int count = 0;
        int i = 2; //start from 2
        
        //while loop
        while (count < n) {
            if (isPrime(i) && isPalindrome(i)) {
                palindromicPrimes[count] = i;
                count++;
            }
            i++;
        }
        return palindromicPrimes;
    }

    //function check isPrime
    public static boolean isPrime(int n) {
        //check if n <= 1 return false
        if (n <= 1) {
            return false;
        }
        //loop 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            //check if n modulo i = 0 return false
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    //function check palindrome
    public static boolean isPalindrome(int n) {
        String numberString = Integer.toString(n);//convert string to integer
        int length = numberString.length(); // assign numberString to length

        //loop 
        for (int i = 0; i < length / 2; i++) {
            //check if not equal return false
            if (numberString.charAt(i) != numberString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
    