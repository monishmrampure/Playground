import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner br = new Scanner(System.in);
      	int num = br.nextInt();
      	for(int row = 1;row <= num;row++){
          for(int col = 1;col <= num; col++){
            System.out.print(row);
          }
          System.out.println();
        }
	}
}