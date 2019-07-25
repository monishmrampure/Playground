import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner br = new Scanner(System.in);
      int number = br.nextInt();
      int temp = number;
      int sum = 0;
      while(number > 0)
      {
        int i = 1;
        int p = 1;
        int reminder = number % 10;
        while(i <= reminder)
        {
          p = p * i;
          i++;
        }
        sum = sum + p;
        number = number / 10;
      }
      if(sum == temp)
      	System.out.println("Yes");
      else
        System.out.println("No");
	}
}