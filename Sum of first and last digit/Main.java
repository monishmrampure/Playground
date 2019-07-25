import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      	Scanner br = new Scanner(System.in);
      	int n = br.nextInt();
      	int n1 = n % 10;
      	while(n > 10)
        {
          n = n/10;
        }
      	int sum = n + n1;
      	System.out.println(sum);
	}
}