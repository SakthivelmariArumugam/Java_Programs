import java.util.*;
public class Next_Ten_Dates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m[]=s.split("-");
        int a=Integer.parseInt(m[0]);
        int b=Integer.parseInt(m[1]);
        int c=Integer.parseInt(m[2]);
        int leap=0;
        String s1;
        if((c%4==0 && c%100!=0)||(c%400==0))
        {
            leap=1;
        }
        a=a+1;
        int count=0;
        while(count<10)
        {
            if(b==2)
            {
                if(a==29 && leap==0)
                {
                    a=1;
                    b=b+1;
                    continue;
                }
                if(a==30 && leap==1)
                {
                    a=1;
                    b=b+1;
                    continue;
                }
            }
            if((a==31) && (b==4 || b==6 || b==9 || b==11))
            {
                a=1;
                b=b+1;
                continue;
            }
            if((a==32) && (b==1 || b==3 || b==5 ||b==7 || b==8 || b==10))
            {
                a=1;
                b=b+1;
                continue;
            }
            if((a==32) && (b==12))
            {
                a=1;
                b=1;
                c=c+1;
                continue;
            }
            s1=String.format("%02d-%02d-%02d",a,b,c);
            System.out.println(s1);
            a=a+1;
            count=count+1;


        }

    }

}
