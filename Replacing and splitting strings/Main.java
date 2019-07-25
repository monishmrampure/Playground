import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      int no_of_parts = sc.nextInt();
      String str3 = str1.replace(str1, str2);
      String flag[] = str3.split(" ",no_of_parts);
      for(String res: flag){
        System.out.println(res);
      }
    }
}