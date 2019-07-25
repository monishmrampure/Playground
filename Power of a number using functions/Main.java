import java.util.Scanner;
class Main{
  	public static int power_of(int a, int b){
      int power = 1;
      while(b >= 1){
        power = power * a;
        b--;
      }
      return power;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      int result = power_of(base, exponent);
      System.out.println(result);
	}
}