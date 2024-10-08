import java.util.Scanner;

public class Minimize {
    public static int sum(Scanner sc)
    {
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=Math.abs(n2-n1);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int m=sum(sc);
            a[i]=m;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
