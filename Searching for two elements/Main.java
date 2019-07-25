import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int arr[] = new int[n];
      	for(int i = 0;i <= n-1;i++){
          arr[i] = sc.nextInt();
        }
      	int search_ele1 = sc.nextInt();
      	int search_ele2 = sc.nextInt();
      	int ele_1_i = -1;
      	int ele_2_i = -1;
      	for(int i = 0;i <= n-1;i++){
          if(search_ele1 == arr[i]){
            ele_1_i = i;
          }
          if(search_ele2 == arr[i]){
            ele_2_i = i;
          }
        }
      	System.out.println(ele_1_i);
      	System.out.println(ele_2_i);
    }
}