import java.io.*;

import java.util.Scanner;


public class arraydouble{
    
    public static int[] resize(int[] a)

    {
        int[] newA=new int[a.length*2];
        for(int i=0;i<a.length;i++){

            newA[i]=a[i];
        }
        return newA;
    }

    public static void main(String args[])
    {   
        Scanner in=new Scanner(System.in);
        int a[]=new int[3];
        System.out.println("Enter items into array");
        int i=0,current=0;
        while(true)
        {
            int len=a.length;
            if(current>=len)
            {
                a=resize(a);
                System.out.println("new length "+a.length);
            }
            a[i]=in.nextInt();
            current=++i;

        }
    }
}