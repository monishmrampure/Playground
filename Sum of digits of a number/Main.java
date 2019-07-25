import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      	Scanner br = new Scanner(System.in);
      	int n = br.nextInt();
      	int sum = 0;
      	while(n > 0)
        {
          	int rem = n%10;
          	sum = sum +rem;
          	n = n/10;
        }
      	System.out.println(sum);
	}
}