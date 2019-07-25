import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int n1_firstnum = number/100;
    int n2_secondnum = ((number/10)%10);
    int n3_lastnum = number%10;
    int reverse = (n3_lastnum*100 + n2_secondnum*10 + n1_firstnum);
    System.out.println(reverse);
  }
}