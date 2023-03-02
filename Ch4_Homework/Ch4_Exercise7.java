 
 
 /*
 Exercise 7
 Java program to remove substring from a given string
 inporting  packages for our program

 */ 

 import java.util.Scanner;
 
public class Ch4_Exercise7 {
    class RemoveSubstring
    {
     public static void main(String[] args)
     {
       Scanner s = new Scanner(System.in);      // Scanner class get by user
       System.out.println("Substring Removal program");
       System.out.println("<<<<>>>>>");
       System.out.println("Inter the main String :");
       String s1 = s.nextLine();           // This nextLine() method is used to input line 
       System.out.println("Inter SubString :");
       String s2 = s.nextLine();
       int index = s1.indexOf(s2);        // This indexOf() method used to find the starting index of s2 in s1
       
       if( index != -1){
               int len = s2.length();
               StringBuffer sb = new StringBuffer(s1);
               sb.delete(index,index+len);
               System.out.println("The string after removal :" + sb);
        }
        else
        {
            System.out.println("substring is not ccurred in main string!!!");
        }
      }
    }
}
 


