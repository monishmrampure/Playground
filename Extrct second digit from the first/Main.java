import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      	Scanner br = new Scanner(System.in);
      	int n = br.nextInt();
      	while(n >=100)
        {
          n = n/10;
        }
      	int n1 = n % 10;
      	System.out.println(n1);
	}
}