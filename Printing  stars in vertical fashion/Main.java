import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner br = new Scanner(System.in);
    int num = br.nextInt();
    for(int count = 1;count <= num;count++)
    {
      System.out.print("*\n");
    }
  }
}