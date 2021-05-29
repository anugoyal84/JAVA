import java.util.*;
class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        double s=0,s1=0,av;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
            s1=s;
        }
        av=(s1)/n;
        System.out.println("Average="+av);
    }
}