import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i <= (n-1);i++){
      arr[i] = sc.nextInt();
    }
    int sum_arr[] = new int[3 * n];
    increasing_sub_array(n, arr, sum_arr);
  }
  public static void increasing_sub_array(int n,int arr[],int sum_arr[]){
    for(int i1 = 0;i1 <= (n-1);i1++){
      int key = arr[i1];
      int flag = 1;
      for(int i2 = i1 + 1;i2 <= (n-1);i2++){
        if(arr[i2] > key){
          for(int i3 = i1;i3 <= i2;i3++){
            if(arr[i3] > arr[i2]){
              flag = 0;
            }
          }
          if(flag == 1){
            System.out.println(key+","+arr[i2]+" ");
          }
          flag = 1;
        }
      }
    }
  }
}