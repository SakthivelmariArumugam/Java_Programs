import java.util.*;
public class Little_Nikita {
    public static String fun(Scanner sc)
    {
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>=n2)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> s1=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            String m=fun(sc);
            s1.add(m);
        }
        for(int i=0;i<s1.size();i++)
        {
            System.out.println(s1.get(i));
        }

    }
}
