import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String str[] = input.split(" ");
    for(int i = 0;i < str.length;i++){
      if(str[i] != null){
        for(int j = i+1;j < str.length;j++){
          if(str[i].equals(str[j])){
            str[j] = null;
          }
        }
      }
    }
    for(int i = 0;i < str.length;i++){
      if(str[i] != null){
        System.out.print(str[i]+" ");
      }
    }
  }
}