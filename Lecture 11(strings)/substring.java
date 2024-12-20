import java.util.*;
public class functions
{
    public static String substring(String str,int st,int en)
    {
        String substr="";
        for(int i=st;i<en;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="HELLOWORLD";
        System.out.println(str.substring(3,7));
        System.out.println(substring(str,3,7));
    }
}