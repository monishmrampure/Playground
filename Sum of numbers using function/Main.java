import java.util.Scanner;
class Main{
  	public static int number(int num){
      int sum = 0;
      int count = num;
      while(count > 0){
        sum = sum + count;
        count--;
      }
      return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = number(n);
      System.out.println(result);
	}
}