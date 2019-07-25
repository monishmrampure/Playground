import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner br = new Scanner(System.in);
      int  n = br.nextInt();
      int sum = 0;
      int temp = n;
      while(n > 0)
      {
        int p = n % 10;
        n = n / 10;
        sum = sum + (p * p * p);
      }
    if(temp == sum)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not a Armstrong Number");
    }
}