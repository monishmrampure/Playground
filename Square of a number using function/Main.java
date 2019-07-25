import java.util.Scanner;
class Main
{
  	public static int square(int num){
      int sum;
      sum = num * num;
      return sum;
    }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = square(n);
      System.out.println(result);
	} 
}