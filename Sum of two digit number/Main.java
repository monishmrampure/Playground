import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      	Scanner in = new Scanner(System.in);
      	int n1 = in.nextInt();
      	n1 = n1/10 + n1%10;
      	System.out.println(n1);
	}
}