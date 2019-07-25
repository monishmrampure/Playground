import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner sc = new Scanner(System.in);
      	int n1 = sc.nextInt();
      	int n2 = sc.nextInt();
      	int n3 = sc.nextInt();
      	int result = greatest(n1, n2, n3);
      	System.out.println(result);
	}
  	public static int greatest(int m1,int m2,int m3){
      int value;
      if((m1 > m2) && (m1 > m3))
        value = m1;
      else if((m2 > m3) && (m2 > m1))
        value = m2;
      else
        value = m3;
      return value;
    }
}