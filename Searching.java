import java.util.*;
class Searching
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c,x,i;
        System.out.println("Enter the size of the array");
        c=sc.nextInt();
        System.out.println("Enter the value you want to search");
        x=sc.nextInt();
        int n[]=new int[c];
        System.out.println("Enter the elements");
        for(i=0;i<c;i++)
        {
            n[i]=sc.nextInt();
        }
        for(i=0;i<c;i++)
        {
        if(n[i]==x)
        {
            System.out.println(i);
        }
else if(n[i]!=x)
{
    System.out.println("-1");
}
}
}
}
