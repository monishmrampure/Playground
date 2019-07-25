import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int value = sum_of_nnumbers(num);
      System.out.println(value);
    }
  	public static int sum_of_nnumbers(int n){
      if(n > 0){
        return n + sum_of_nnumbers(n-1);
      }
      else 
        return 0;
    }
}