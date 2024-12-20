import java.util.*;
public class basic
{ public static void letters(String str)
{
    for(int i=0;i<str.length();i++)
    {
        System.out.println(str.charAt(i));
    }
}
    public static void main(String args[])
    {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str1=new String("xyz");
        //STRINGS ARE IMMUTABLE
        
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(name);
        System.out.println(name.length());
        String fullName=name+" "+"banu";
        System.out.println(fullName);
        letters(fullName);
    }
}