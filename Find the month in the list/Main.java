import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String> l1 = new LinkedList<String>();
      String m = br.readLine();
      String arr[] = m.split(",");
      for(int i = 0;i < arr.length;i++){
        l1.add(arr[i]);
      }
      System.out.println(l1);
      System.out.println("Size of the linked list: "+l1.size());
      System.out.println("Is LinkedList empty? "+l1.isEmpty());
      String m1 = br.readLine();
      System.out.println("Does LinkedList contains "+m1+"?");
      System.out.println(l1.contains(m1));
    }
}