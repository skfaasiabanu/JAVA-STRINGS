import java.util.*;
public class palindrome
{
    public static boolean fun(String str)
    {
        int n=str.length();
        for(int i=0;i<((str.length())/2);i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;//here if we write true condition iw send 'n' times true so once it is not equal then it is better to pass false
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       
       System.out.println(fun(name));
       if(fun(name))
       {
        System.out.println("palindrome");
       }
       else{
        System.out.println("not palindrome");
       }

    }
}