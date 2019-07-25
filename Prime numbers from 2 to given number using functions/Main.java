import java.util.Scanner;
class Main{
  	public static boolean prime(int n){
      boolean isprime = true;
      for(int num = 2;num <= n/2;num++){
        if(n % num == 0){
          isprime = false;
          break;
        }
      } 
      return isprime;
    }
	public static void main(String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      for(int i = 2;i <= number;i++){
        if(prime(i)){
          System.out.println(i);
        }
	}
  }
}