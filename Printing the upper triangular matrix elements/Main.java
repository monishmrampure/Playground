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
    upper_triangular(r, c, matrix);
  }
  public static void upper_triangular(int r,int c,int matrix[][]){
    int i, j, k;
    for(k = 0;k < c;k++){
      for(i = 0, j = k;j < c;i++, j++){//important statement condition
        System.out.print(matrix[i][j]+" ");
      }
    }
  }
}