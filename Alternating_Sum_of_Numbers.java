import java.util.Scanner;

public class Alternating_Sum_of_Numbers {
    public static int sum(Scanner sc)
    {
        int n1=sc.nextInt();
        int a[]=new int[n1];
        int sum=0;
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
            if(i%2==0)
            {
                sum=sum+a[i];
            }
            else
            {
                sum=sum-a[i];
            }
        }
        return sum;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int m=sum(sc);
            c[i]=m;
           
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
    }
}
