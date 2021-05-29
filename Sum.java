import  java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter the number of elements of the array");
        n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
             s+=a[i];
        }
            System.out.println("Sum of the elements="+s);
        }
    }