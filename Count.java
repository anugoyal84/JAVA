import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,c=0,d=0,e=0,f=0,g=0,i;
        char ch;
        System.out.println("Enter the string");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                c++;
                System.out.println("Number of spaces="+c);
            }
            else if((ch>='A')&&(ch<='Z'))
            {
                d++;
                System.out.println("Number of capital letters="+d);
            }
           else if((ch>='a')&&(ch<='z'))
            {
                e++;
                System.out.println("Number of small letters="+e);
            }
            else if((ch>=0)&&(ch<=9))
            {
                f++;
                System.out.println("Number of numbers="+f);
            }
            else
            {
                g++;
                System.out.println("Number of special characters="+g);
            }
        }
    }
}