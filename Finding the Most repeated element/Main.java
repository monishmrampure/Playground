import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i <= (n-1);i++){
      arr[i] = sc.nextInt();
    }
    int freq[] = new int[n];
    int result = mostFrequent(arr, n, freq);
    System.out.println(result);
  }
  static int mostFrequent(int arr[],int n,int freq[]){
    int max_count_i = 0;
    int curr_count = 1;
    for(int i = 0;i <= (n-1);i++){
      for(int j = (i+1);j <= (n-1);j++){
        if(arr[i] == arr[j]){
          curr_count++;
        }
        freq[i] = curr_count;
        curr_count = 1;
      }
    }
    for(int i = 0;i <= (n-1);i++){
      if(freq[i] > freq[max_count_i]){
        max_count_i = i;
      }
    }
    return arr[max_count_i];
  }       
}