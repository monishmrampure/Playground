import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	for(int i = 0;i <= n-1;i++){
          arr[i] = sc.nextInt();
        }
    	int n_rotate = sc.nextInt();
    	left_rotate_even_elem(n, arr, n_rotate);
    	right_rotate_odd_elem(n, arr, n_rotate);
    	for(int i = 0;i <= n-1;i++){
          System.out.print(arr[i]+" ");
        }
  	}
  	public static void left_rotate_even_elem(int n,int arr[],int n_rotate){
      int first_i = 1;
      int last_i;
      if(n % 2 == 0){
        last_i = n-1;
      }
      else
        last_i = n-2;
      for(int rotate = 1;rotate <= n_rotate;rotate++){
        int temp = arr[first_i];
        for(int i = 3;i <= n - 1;i = i + 2){
          arr[i - 2] = arr[i];
        }
        arr[last_i] = temp;
      }
    }
  	public static void right_rotate_odd_elem(int n,int arr[],int n_rotate){
      int first_i = 0;
      int last_i;
      if(n % 2 == 1){
        last_i = n - 1;
      }
      else
        last_i = n - 2;
      for(int rotate = 1;rotate <= n_rotate;rotate++){
        int temp = arr[last_i];
        for(int i = (last_i - 2);i >= 0;i = i - 2){
          arr[i + 2] = arr[i];
        }
        arr[first_i] = temp;
      }
    }
}