import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      	Scanner sc = new Scanner(System.in);
      	int option = sc.nextInt();
      	switch(option){
          case 1: int side = sc.nextInt();
            	  int area_sq = side * side;
                  System.out.println(area_sq);
            	  break;
          case 2: int length = sc.nextInt();
            	  int breath = sc.nextInt();
            	  int area_rec = length * breath;
            	  System.out.println(area_rec);
            	  break;
          case 3: int base = sc.nextInt();
            	  int height = sc.nextInt();
            	  int area_tri = (base * height) / 2;
            	  System.out.println(area_tri);
            	  break;
          case 4: int radius = sc.nextInt();
            	  double area_cir = 3.14 * radius * radius;
            	  System.out.println(area_cir);
            	  break;
        }
    }
}