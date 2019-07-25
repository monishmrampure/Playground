import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	for(int row = 1;row <= n;row++){
          for(int space = 1;space <= n-row;space++){
            System.out.print(" ");
          }
          for(int col = 1;col <= 2*row-1;col++){
            System.out.print("*");
          }
          System.out.println();
        }
	}
}