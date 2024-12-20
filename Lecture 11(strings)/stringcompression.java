import java.util.*;
public class stringcompression
{
    public static String compress(String str)
    {//aaabc
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
        
    
    //upper loop runs for aa because 3rd a is not equal to b
    str1+=str.charAt(i);
    if(count>1)
    {
        str1+=count.toString();
    }
        }
        return str1;
    }
    public static void main(String args[])
    {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}