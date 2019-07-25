import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0;i < n;i++){
      list[i] = sc.nextInt();
    }
    insertion_sort(n, list);
  }
  public static void insertion_sort(int n,int list[]){
    for(int i1 = 1;i1 < n/2;i1++){
      int key = list[i1];
      int i2 = i1-1;
      while((i2 >= 0) && (list[i2] > key)){
        list[i2 + 1] = list[i2];
        i2--;
      }
      list[i2 + 1] = key;
    }
    for(int i = 0;i < n;i++){
      System.out.print(list[i]+" ");
    } 
  }
}