import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Get the input
        char ch = in . next().charAt(0);
        int key = in.nextInt();
        // Subtract the key value from the given character and store it in a variable "ch"
        // If it is less than 'a' or 'A', then add it with 26.
        // Otherwise print "ch"
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - key);
            if(ch < 'a'){
                ch = (char)(ch + 26);
            }
        }
        else if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch - key);
            if(ch < 'A'){
                ch = (char)(ch + 26);
            }
        }
        System.out.print(ch);
    }
}