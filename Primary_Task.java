import java.util.*;
public class Primary_Task {
    public static String fun(Scanner sc)
    {
        int n1=sc.nextInt();
        if(n1<100)
        {
            return "No";
        }
        int three=0,four=0;
        String m=String.valueOf(n1);
        if(m.length()>3) {
            three = m.charAt(2)-'0';
            four=m.charAt(3)-'0';
        }
        else if(m.length()==3)
        {
            three =m.charAt(2)-'0';
        }

        if(m.charAt(0)=='1' && m.charAt(1)=='0'&&three>=2)
        {
            return "Yes";
        }
        if(m.charAt(0)=='1' && m.charAt(1)=='0'&&three>=1 && four>=0 && n1>=1000)
        {
            return "Yes";
        }
        return "No";
    }
    public static void main(String args[])
    {
        ArrayList<String> s1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
