import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i <= n - 1;i++){
      arr[i] = sc.nextInt();
    }
    perfect_batch(arr,n);
  }
  public static void perfect_batch(int arr[],int n){
    boolean perfect = true;
    int sum = arr[0] + arr[1] + arr[2];
    for(int i = 3;i <= n - 1;i = i + 3){
      int cur_sum = arr[i] + arr[i + 1] + arr[i + 2];
      if(cur_sum != sum){
        perfect = false;
      }
    }
    if(perfect == true){
      System.out.println("Perfect Batch");
    }
    else
      System.out.println("Not a Perfect Batch");
  }
}