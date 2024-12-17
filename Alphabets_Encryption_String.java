import java.util.*;
public class Alphabets_Encryption_String {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a[]=new int[s.length()];
        int b[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=sc.nextInt();
            b[i]=(int)s.charAt(i);
           // System.out.println("The char value:"+b[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<=i;k++) {
                b[k] = b[k] + a[i];
                if (b[k] > 90 && s.charAt(k)>='A' && s.charAt(k)<='Z') {
                    b[k] = b[k] - 26;
                    // System.out.println("Hi"+" "+s.charAt(k));

                }
                if (b[k] > 122 && s.charAt(k)>='a' && s.charAt(k)<='z') {
                    b[k] = b[k] - 26;
                    //System.out.println("Hello"+" "+s.charAt(k));
                }

                //System.out.println("b[k] value:"+b[k]);
            }
       }

        for(int j=0;j<b.length;j++)
        {

            System.out.print((char)b[j]);
        }

    }
}
