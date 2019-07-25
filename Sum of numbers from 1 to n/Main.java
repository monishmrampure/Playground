import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner br = new Scanner(System.in);
      int n = br.nextInt();
      int sum = 0;
      int count;
      for(count = 1;count <= n;count = count + 1)
      {
        sum = sum + count;
      }
      System.out.println(sum);
	}
}