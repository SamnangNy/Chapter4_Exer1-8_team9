/*
 Exercise3
 A palindrome is a word, number, or other sequence of characters which reads the same backward as 
forward. Write a method called generatePalindromes asks the user how many even palindromes 
they want, then returns an array that contains those palindromes. 

 */


import java.util.Scanner;
public class Ch4_Exercise3{

    //Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of even palindromes to generate: "); //message for user
        int n = input.nextInt(); //for user input
        int[] palindromes = generatePalindromes(n); // create object for generatePalindromes
        System.out.print("The even palindromes are: "); //message 
        //display result
        for (int palindrome : palindromes) {
            System.out.print(palindrome + " ");
        }
        input.close();
    }

    //function generatePalindromes
    public static int[] generatePalindromes(int n) {
        int[] palindromes = new int[n]; //create number array of n
        int palindrome = 11; //start form number 11
        //for loop
        for (int i = 0; i < n; i++) {
            palindromes[i] = palindrome;
            palindrome += 11;
        }
        return palindromes;
    }
}
