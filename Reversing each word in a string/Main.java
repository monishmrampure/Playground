import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    reverseWord(str);
  }
  public static void reverseWord(String str){
    String words[] = str.split(" ");
    String reversedString = "";
    for(int i = 0;i < words.length;i++){
      String word = words[i];
      String reverseWord = "";
      for(int j = word.length()-1;j >= 0;j--){
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord + " ";
    }
    System.out.println(reversedString);
  } 
}