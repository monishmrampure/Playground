import java.util.*;
public class Main<T> 
{ 
  // type your code here
  private T t;
  public void insert(T t){
  	this.t = t;
  }
  public T get(){
  	return t;
  }
  public static void main(String[] args) 
     { 
       // type your code here
       Scanner sc = new Scanner(System.in);
       Main<Integer> in = new Main<Integer>();
       int num = sc.nextInt();
       in.insert(num);
       
       Main<String> str = new Main<String>();
       String str1 = sc.next();
       str.insert(str1);
       
       Main<Float> f = new Main<Float>();
       float f1 = sc.nextFloat();
       f.insert(f1);
       
       System.out.println("Integer Value: "+in.get());
       System.out.println("String Value: "+str.get());
       System.out.println("Float value: "+f.get());
     }
 }