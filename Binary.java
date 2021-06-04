import java.util.*;
class Binary
{
        public static void main(String args[])
      {
           Scanner sc = new Scanner(System.in);
             int n,val;
            System.out.println("Enter the size of the array");
           n=sc.nextInt();
           int a[]=new int[n];
          System.out.println("Enter the elements in the array");
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
          System.out.println("Enter the value you want to search");
          val=sc.nextInt();
          int s,e,mid;
          s=0;
          e=n-1;
          mid=(s+e)/2;
          while(s<=e)
          {
              if(a[mid]<val)
              {
                  s=mid+1;
                }
                else if(a[mid]==val)
                {
                 System.out.println(mid+1);
                 break;
                }
                  else
                 {
                 e=mid-1;
                     }
                    if(s>e)
                    {
                       System.out.println("Location not found");
                     }
                    }
                }
            }