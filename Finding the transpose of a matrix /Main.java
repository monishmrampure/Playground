import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0;i <= (r-1);i++){
      for(int j = 0;j <= (c-1);j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    int transpose[][] = new int[c][r];
    for(int i = 0;i <= (r-1);i++){
      for(int j = 0;j <= (c-1);j++){
        transpose[i][j] = matrix[i][j];
      }
    }
    for(int i = 0;i <= (c-1);i++){
      for(int j = 0;j <= (r-1);j++){
        System.out.print(transpose[i][j]+ " ");
      }
      System.out.println();
    }
  }
}