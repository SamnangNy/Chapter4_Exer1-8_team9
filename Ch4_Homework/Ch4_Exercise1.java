/*
 Exercise1
Write a method called split that will accept a sentence then split it into words, and returns an array 
of those words. Note: the input sentence might contain special characters, but words cannot. Also, 
you are not allowed to use the split() method from the String class.

 */

public class Ch4_Exercise1 {  

    // create checkPrimeNumber() method to check whether the number is prime or not  
    static boolean checkPrimeNumber(int number)  
    {  
        int i;
        if(number == 0 || number == 1){
            return false;
        }
        for(i = 2; i <= number/2 ;i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    // create checkTwinPrimeNumber() to check whether the numbers are twin prime or not  
    static boolean checkTwinPrimeNumber(int number1, int number2)  
    {  
        if(checkPrimeNumber(number1) && checkPrimeNumber(number2) && Math.abs(number1 - number2) == 2)
            return true;
        else
            return false;
    }

    static void displayTwinPrimes(int startRange, int endRange){
        System.out.println("The pairs of twin primes between " + startRange + " and " + endRange + " are:");
        for (int i = startRange; i < endRange-2; i++) {
            if (checkTwinPrimeNumber(i, (i + 2))){
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int startRange = 1;
        int endRange = 1200;
        displayTwinPrimes(startRange, endRange);
    }
}