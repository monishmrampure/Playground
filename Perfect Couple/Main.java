import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i <= n-1;i++){
        arr[i] = sc.nextInt();
      }
      int value = sc.nextInt();
      perfect_couple(n, arr, value);
    }
  	public static void perfect_couple(int n, int arr[],int value){
      for(int i1 = 0;i1 <= n-1;i1++){
        for(int i2 = i1+1;i2<=n - 1;i2++){
          int sum = arr[i1] + arr[i2];
          if(sum == value){
          	System.out.println(arr[i1]+","+" "+arr[i2]);
        	}
        }
      }
    }
}