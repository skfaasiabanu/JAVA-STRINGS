import java.util.*;
public class functions
{
    public static void main(String args[])
    {
        String s1="hi";
        String s2="hi";
        String s3=new String("hi");
        if(s1==s2)
        {
          System.out.println("equal");
        }
        else
        {
            System.out.println("not");
        }
        if(s1==s3)
        {
           System.out.println("equal"); 
        }
        else{
            System.out.println("not");
        }
        if(s1.equals(s3))
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not");
        }
    }
}