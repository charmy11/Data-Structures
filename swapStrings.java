import java.io.*;
import java.util.Scanner;
import java.util.*;
public class swapStrings{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String one,two;
            one=in.nextLine();
            two=in.nextLine();
            one+=two;
            two=one.substring(0,one.length()-two.length());
            one=one.substring(two.length());
    
       

        System.out.println(one+two);
    }
    public static void swap(String one,String two)
    {
        
        one+=two;
        two=one.substring(0,one.length()-two.length());
        one=one.substring(two.length()+1);


    }
}