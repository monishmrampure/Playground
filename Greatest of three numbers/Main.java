import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      	Scanner br = new Scanner(System.in);
      	int num1 = br.nextInt();
      	int num2 = br.nextInt();
      	int num3 = br.nextInt();
      	if(num1>num2 && num1>num3)
          System.out.println(num1);
      	else if(num2>num3 && num2>num1)
          System.out.println(num2);
      	else if(num3>num1 && num3>num2)
          System.out.println(num3);
      	else
          System.out.println("better luck next time");
    }
}