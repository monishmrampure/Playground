import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      	Scanner sc = new Scanner(System.in);
      	int base = sc.nextInt();
      	int exponent = sc.nextInt();
      	int result = 1, count = 0;
      	while(count < exponent){
          result = result * base;
          count++;
        }
      	System.out.println(result);
    }
}