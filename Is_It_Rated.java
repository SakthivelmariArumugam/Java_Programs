import java.util.Scanner;

public class Is_It_Rated {

    public static int[] rate(Scanner sc)
    {
        int a1[]=new int[2];
        a1[0]=sc.nextInt();
        a1[1]=sc.nextInt();
        return a1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        int count1=0;
        int t1=Integer.MAX_VALUE;
        boolean m=true;
        for(int i=0;i<n;i++)
        {
            int value[] =rate(sc);
            int sum=Math.abs(value[0]-value[1]);
            if(sum==0)
            {
               count1++;
            }
            if(value[0]<=t1)
            {
                t1=value[0];
            }
            else
            {
                m=false;
            }

        }
        if(count1!=n)
        {
              System.out.print("rated");
        }
        else if(m)
        {
            System.out.print("maybe");
        }
        else
        {
            System.out.print("unrated");
        }

    sc.close();
    }
}
