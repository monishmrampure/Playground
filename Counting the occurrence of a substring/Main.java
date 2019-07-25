import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    int str1_len = str1.length();
    int str2_len = str2.length();
    int occur_cnt = 0;//to count the occurance
    for(int i = 0;i < (str1_len - str2_len + 1);i++){
      boolean is_matching = true;
      for(int j = 0;j < str2_len;j++){
        if(str1.charAt(i + j) != str2.charAt(j)){
          is_matching = false;
        }
      }
      if(is_matching == true){
        occur_cnt++;
      }
    }
    System.out.println(occur_cnt);
  } 
}