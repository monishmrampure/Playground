import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
      	int val = num;
      	for(int row = 1;row <= num;row++){
          for(int col = val;col >= 1;col--){
            System.out.print(col);
          }
          val--;
          System.out.println();
        }
	}
}