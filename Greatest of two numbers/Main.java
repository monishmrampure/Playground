import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      	Scanner in = new Scanner(System.in);
      	int number1 = in.nextInt();
      	int number2 = in.nextInt();
      	if(number1 > number2)
        {
          System.out.println("num1 is the greatest number");
        }
      	else
        {
          System .out.println("num2 is the greatest number");
        }  
	}
}