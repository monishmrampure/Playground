import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
       String str, r;
       Scanner scan = new Scanner(System.in);
      
       str = scan.nextLine();

       r = removeVowels(str);
	   
       System.out.print(r);
   }

   public static String removeVowels(String s)
   {
     String finalString = "";
     int i;
     for(i=0; i<s.length(); i++)
     {
       if (!isVowel(Character.toLowerCase(s.charAt(i))))
       {
         finalString = finalString + s.charAt(i);
       }
     }
     return finalString;
   }

   public static boolean isVowel(char c)
   {
     String vowels = "aeiou";
     int i;
     for(i=0; i<5; i++)
     {
       if(c == vowels.charAt(i))
       {
         return true;
       }
     }
     return false;
   }
}