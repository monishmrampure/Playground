import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      	Scanner br = new Scanner(System.in);
      	int n = br.nextInt();
      	int count;
      	for(count = 1;count <= 2*n;count = count + 1)
        {
          if(count % 2 == 1)
          	System.out.println(count);
        }
	}
}