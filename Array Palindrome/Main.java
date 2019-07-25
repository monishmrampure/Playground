import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i <= (n - 1);i++){
        arr[i] = sc.nextInt();
      }
      int left = 0;
      int right = (n - 1);
      boolean is_palindrome = true;
      while(left < right){
        if(arr[left] != arr[right]){
          is_palindrome = false;
          break;
        }
        left++; 
        right--;
      }
      if(is_palindrome == true){
        System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
}