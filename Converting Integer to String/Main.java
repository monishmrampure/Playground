import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int count = 0;
    if(n < 0){
      n = n * -1;
    }
    do{
      count++;
      n = n / 10;
    }while(n > 0 );
    if(temp < 0){
      count = count + 1;
    }
    char arr[] = new char[count];
    if(temp < 0){
      temp = temp * -1;
      arr[0] = '-';
    }
    count = count - 1;
    while(temp > 0){
      char ch = (char)((temp % 10) +'0');
      arr[count] = ch;
      temp = temp / 10;
      count--;
    }
    System.out.println(arr);
  }
}