import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      	Scanner sc = new Scanner(System.in);
      	int num1 = sc.nextInt();
      	int num2 = sc.nextInt();
      	int num3 = sc.nextInt();
      	int result = hcfofnumbers(num1, num2, num3);
      	System.out.println(result);
	}
  	public static int hcfofnumbers(int n1,int n2,int n3){
      return hcfofnumbers(hcfofnumbers(n1,n2),n3);
    }
  	public static int hcfofnumbers(int n1,int n2){
      if(n2 == 0){
        return n1;
      }
      else 
        return hcfofnumbers(n2, n1 % n2);
    }
}