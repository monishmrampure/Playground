import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int freq[] = new int[70];
      for(int i = 0;i <= 69;i++){
        freq[i] = 0;
      }
      for(int i = 0;i <= (str_len - 1);i++){
        if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
          int offset = sb.charAt(i) - 'A' ;
          char ch = (char)('a' + offset);
          sb.setCharAt(i, ch);
        }
        if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
          freq[sb.charAt(i) - 'a']++;
        }
      }
      for(int i = 0;i <= (str_len - 1);i++){
        if(freq[sb.charAt(i) - 'a'] != 0){
          System.out.print(sb.charAt(i)+"" +freq[sb.charAt(i) - 'a']+" ");
          freq[sb.charAt(i) - 'a'] = 0;
        }
      }
    }
}