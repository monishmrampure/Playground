import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i <= (n-1);i++){
        arr[i] = sc.nextInt();
      }
      int freq[] = new int[k];
      for(int i = 0;i <= (k-1);i++){
        freq[i] = 0;
      }
      for(int i = 0;i <= (n-1);i++){
        freq[arr[i] - 1]++;
      }
      for(int i = 0;i <= (k-1);i++){
        System.out.println((i+1)+" "+freq[i]);
      }
    }
}