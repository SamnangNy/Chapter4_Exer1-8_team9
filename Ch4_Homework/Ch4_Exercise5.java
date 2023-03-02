// Two words are anagrams 
import java.util.Arrays; 
import java.util.Scanner; 
public class Ch4_Exercise5 { 
  public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in); 
    //input 
    System.out.print("Enter first word : "); 
    String word1 = sc.nextLine().toLowerCase(); 
    System.out.print("Enter Second word : "); 
    String word2 = sc.nextLine().toLowerCase(); 
    sc.close(); 
    //output with method apply 
    System.out.print("Answer : " + isAnagram(word1, word2)); 
  } 
  //creating method 
  public static String isAnagram(String a, String b){ 
    //initializing 
    String result = ""; 
    String[] Aword = new String[a.length()]; 
    String[] Bword = new String[b.length()]; 
    int x = a.length(); 
    int y = b.length(); 
    //if length is difference end 
    if(x == y){ 
      //seperate each index to array 
      for(int i = 0 ; i<a.length() ; i++){ 
        char tmp = a.charAt(i); 
        Aword[i] = String.valueOf(tmp); 
      } 
      //sort array 
      Arrays.sort(Aword); 
      for(int i = 0 ; i<b.length() ; i++){ 
        char tmp = b.charAt(i); 
        Bword[i] = String.valueOf(tmp); 
      } 
      Arrays.sort(Bword); 
      //compare sorted array if they have the same character 1 by 1 
      for(int i = 0 ; i< a.length() ; i++){ 
        //if they share the same character keep the result = true 
        if(Aword[i].equals(Bword[i])){ 
          result = "TRUE"; 
        } 
        //if not update it to false and end 
        else{ 
          result = "FALSE"; 
          break; 
        } 
      } 
    } 
    else{ 
      result = "FALSE"; 
    } 
    return result; 
  } 
}