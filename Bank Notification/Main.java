import java.util.Scanner;
interface Notification{
  void notificationBySms();
  void notificationByEmail();
  void notificationByCourier();
}
class Details implements Notification
{
    public Details(String bank, int not)
    {
        //write your logic here
      System.out.print(bank);
      switch(not){
        case 1:
          notificationBySms();
          break;
        case 2: 
          notificationByEmail();
          break;
        case 3:
          notificationByCourier();
          break;
      }
    }
  	public void notificationBySms(){
      System.out.println("-Notification by SMS");
    }
  	public void notificationByEmail(){
      System.out.println("-Notification by Mail");
    }
  	public void notificationByCourier(){
      System.out.println("-Notification by Courier");
    }
}
public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        String bank = sc.nextLine();
        int not = sc.nextInt();
        Details d = new Details(bank, not);
    }
}
  