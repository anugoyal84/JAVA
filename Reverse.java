import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String s;
       int l,i;
       char ch;
       System.out.println("Enter the string");
       s=sc.nextLine();
       l=s.length();
       for(i=l-1;i>=0;i--)
       {
           ch=s.charAt(i);
           System.out.print(ch);
        }
    }
}