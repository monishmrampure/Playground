import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      	Scanner br = new Scanner(System.in);
      	int number = br.nextInt();
      	int temp = 0;
      	for(int row = 1;row <= number;row++){
          for(int col = 1;col <= row;col++){
            if(temp == 1){
              System.out.print("#");
              temp = 0;
            }
            else{
              System.out.print("*");
              temp = 1;
            }
          }
          System.out.println();
        }
    }
}