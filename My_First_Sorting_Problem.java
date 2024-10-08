import java.util.Arrays;
import java.util.Scanner;

public class My_First_Sorting_Problem {
    public static int[] fun(Scanner sc)
    {
        int a[]=new int[2];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        Arrays.sort(a);
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a[]=fun(sc);
            System.out.println(a[0]+" "+a[1]);
        }
    }
}
