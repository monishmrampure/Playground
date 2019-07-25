import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int matrix1[][] = new int[r][c];
    for(int i = 0;i <= (r-1);i++){
      for(int j = 0;j <= (c-1);j++){
        matrix1[i][j] = sc.nextInt();
      }
    }
    int matrix2[][] = new int[r][c];
    for(int i = 0;i <= (r-1);i++){
      for(int j = 0;j <= (c-1);j++){
        matrix2[i][j] = sc.nextInt();
      }
    }
    int sum[][] = new int[r][c];
    subtraction_of_2_numbers(matrix1, matrix2, sum);
    display_sum(sum);
  }
  public static void subtraction_of_2_numbers(int matrix1[][],int matrix2[][],int sum[][]){
    for(int i = 0;i <= sum.length-1;i++){
      for(int j = 0;j <= sum[i].length-1;j++){
        sum[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
  }
  public static void display_sum(int matrix[][]){
    for(int i = 0;i <= matrix.length-1;i++){
      for(int j = 0;j <= matrix[i].length-1;j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}