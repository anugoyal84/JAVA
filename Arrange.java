import java.util.*;
class Arrange
{
    public static void main(String args[])
    {    //1 3 5 4 2
        Scanner sc =  new Scanner(System.in);
        int n,i,t,j,k,m;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        if(n%2==0)
        {
                t=(n-1)/2; //midddle position if the size of the array is even
                a[t]=n;  //printing the number in that very middle position
                for(j=t+1;j>=n-1;j--)
                {
                    if(a[j]%2==0)
                    {
                    System.out.print(a[j]);
            }
        }
    }
    else
    {
        t=(n/2);
        a[t]=n;
        for(k=0;k<t;k++)
        {
            if(a[k]%2!=0)
            {
                System.out.print(a[k]);
}
  }
}
}  
}          