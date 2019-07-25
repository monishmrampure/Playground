import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String sub_str = sc.nextLine();
    String result = remove_chars(str, sub_str);
    System.out.println(result);
  }
  public static int[] count_array(String str){
    int count[] = new int[256];
    for(int i = 0;i < str.length();i++){
      count[str.charAt(i)]++;
    }
    return count;
  }
  public static String remove_chars(String str,String sub_str){
    int count[] = count_array(sub_str);
    int ip_ind = 0, res_ind = 0;
    char arr[] = str.toCharArray();
    while(ip_ind != arr.length){
      char temp = arr[ip_ind];
      if(count[temp] == 0){
        arr[res_ind] = arr[ip_ind];
        res_ind++;
      }
      ip_ind++;
    }
    str = new String(arr);
    return str.substring(0, res_ind);
  }
}