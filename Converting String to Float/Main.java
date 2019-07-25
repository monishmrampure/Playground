import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int str_len = str.length();
    double adec = 0;
    double bdec = 0;
    int flag = 0;
    for(int i = 0;i <= (str_len-1);i++){
      if(str.charAt(i) == '.'){
        flag = 1;
      }
    }
    if(flag == 1){
      for(int i = (str_len-1);str.charAt(i) != '.' && i >= 0;i--){
        adec = adec/10 + (str.charAt(i) - '0');
      }
      adec = adec / 10;
      for(int i = 0;str.charAt(i) != '.';i++){
        bdec = bdec * 10 + (str.charAt(i) - '0');
      }
    }
    else{
      for(int i = 0;i <= (str_len-1);i++){
        bdec = bdec * 10 + (str.charAt(i) - '0');
      }
    }
    double sum = (adec + bdec);
    System.out.printf("%.6f",+sum);
  }
}