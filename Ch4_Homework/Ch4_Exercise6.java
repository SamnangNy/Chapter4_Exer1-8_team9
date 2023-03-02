
// split sentence into words 
import java.util.Scanner; 
public class Ch4_Exercise6 { 
  public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in); 
    //input 
    System.out.print("Enter a sentence : "); 
    String input = sc.nextLine(); 
    sc.close(); 
    //print call out method 
    System.out.print(split(input)); 
  } 
  //method 
  public static String split(String s){ 
    //initialize 
    String result = ""; 
    char[] word = new char[s.length()]; 
    //loop to seperate each index to store in array char 
    for(int i = 0 ; i < s.length() ; i++){ 
      char a = s.charAt(i); 
      word[i] = a;  
    } 
    //loop to give word to result 
    for(int i = 0 ; i <word.length; i++){ 
      if(word[i] ==  ' '){ 
        result += "\n"; 
      } 
      //if char return space result new line 
      if(word[i] >= 97 && word[i] <= 122 || word[i] >= 65 && word[i] <= 90 
        || word[i] >= 48&& word[i] <= 57 ){ 
        //else just add each index together to form back original word 
          result += word[i]; 
      } 
    } 
    return result; 
  } 
}