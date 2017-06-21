import java.io.*;
import java.util.*;
public class Subset {
    public static void main(String args[])
    {   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i,sum1=0,avg1,sum2=0,avg2;
    int a[]=new int[n];
    int b[]=new int[n/2+1];
    int v[]=new int[n/2];
    for(i=0;i<n;i++)
    {a[i]=s.nextInt();
    }
    System.arraycopy(a, 0, b, 0, (n-(n/2)));
    System.arraycopy(a,(n/2+1),v,0,(n/2));
    for(int d:b)
    {
        System.out.println(d);
   }for(int g:v)
    {System.out.println(g);
     }
   for(i=0;i<b.length;i++)
   {
    sum1=sum1+b[i];
   }avg1=sum1/b.length;
   
    //System.out.println(avg1);
     for(i=0;i<v.length;i++)
   {
    sum2=sum2+v[i];
   }avg2=sum2/v.length;
  
    //System.out.println(avg2);
    if(avg1==avg2)
    {  for(i=0;i<b.length;i++)
        {
    System.out.print(b[i]);
    }
    for(i=0;i<v.length;i++)
    {
    System.out.print(" "+v[i]);
    }}
    else
    {System.out.println("not possible");
    
    }
    }}
    
