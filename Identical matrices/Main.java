import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int arr[][] = new int[r][c];
    for(int i = 0;i < r;i++){
      for(int j = 0;j < c;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int flag = 0;
    int brr[][] = new int[r][c];
    for(int i = 0;i < r;i++){
      for(int j = 0;j < c;j++){
        brr[i][j] = sc.nextInt();
      }
    }
    for(int i = 0;i < r;i++){
      for(int j = 0;j < c;j++){
        if(arr[i][j] != brr[i][j]){
          flag = 1;
          break;
        }
      }
    }
    if(flag == 0){
      System.out.print("Yes");
    }
    else
      System.out.print("No");
  }
}