import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        for(int index1 = 1; index1 <= row; index1++)
        {
            for(int index2 = column; index2 > column - index1 ; index2--)
            {
                System.out.print(index2);
            }
            for(int index2 = 1; index2 <= column - index1; index2++)
            {
                System.out.print(row - index1 + 1);
            }
            System.out.println();
        }
    }
}