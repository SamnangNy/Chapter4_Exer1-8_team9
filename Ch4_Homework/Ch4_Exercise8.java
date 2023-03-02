
/*
 Exercise 8
 1. A password must have exactly 8 characters.
 2. A password must consist of only digits and letters.
 3. A password must always start with a digit.
 4. A password must contain at least one uppercase letter.

*/

import java.util.Scanner;
class checkvalidpw {

	public static void main (String [] args) {

		String inputPassword;		   // Creates the Password variable

		Scanner input = new Scanner (System.in);			

		System.out.print("Inter your Password: ");	// Prints the word "Password" to the screen
		inputPassword = input.next();		     //  User input for the password

		System.out.println(checkValidPassword(inputPassword));	 // Calls the checkValidPassword Method 
		System.out.println("");

		main(args);			// re-runs the program (Allows for multiple tests)

	}

	public static String checkValidPassword (String Password) {

		String result = "Valid Password";			// Sets the initial result as valid
		int length = 0;						// Stores the number characters in the password
		int numCount = 0;			// Variable used to store numbers in the password
		int capCount = 0;	      // Variable used to store capital letters in the password


		for (int i =0; i < Password.length(); i++) {
			if ((Password.charAt(i) >= 47 && Password.charAt(i) <= 58) || (Password.charAt(i) >= 64 && Password.charAt(i) <= 91) ||
				(Password.charAt(i) >= 97 && Password.charAt(i) <= 122)) {
					//Keep the Password
				} else {
					result = "Password Contains Invalid Character!"; //Checks that password contains only letters and numbers
				}

			if ((Password.charAt(i) > 47 && Password.charAt(i) < 58)) {	// Counts the number of numbers
				numCount ++;
			}

			if ((Password.charAt(i) > 64 && Password.charAt(i) < 91)) {	 // Counts the number of capital letters
				capCount ++;
			}

			length = (i + 1);		// Counts the passwords length

		} // Ends  loop

		if (numCount < 1){		// Checks that password contains at least one numbers or more
			result = "Not Enough Numbers in Password!!!";
		}

		if (capCount < 1) {		// Checks that password contains at least one capital letters or more
			result = "Not Enough Capital Letters in Password!!!";
		}

		if (length < 8){			// Checks that password is long enough
			result = "Password is Too Short!!!";
		}

			return (result);								

	}
}