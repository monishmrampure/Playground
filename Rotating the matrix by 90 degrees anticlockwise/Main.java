import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0;i < r;i++){
      for(int j = 0;j < c;j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    for(int i = (r-1); i >= 0;i--){
      for(int j = 0;j <= (c-1);j++){
        System.out.print(matrix[j][i]+" ");
      }
      System.out.println();
    }
  }
}