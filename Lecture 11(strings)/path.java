import java.util.*;
public class path
{
    public static float displacement(String str)
    {
       int x=0;
       int y=0;
       for(int i=0;i<str.length();i++)
       {
          char dir=str.charAt(i);
          if(dir=='S')
          {
            y--;
          }
          else if(dir=='N')
          {
            y++;
          }
          else if(dir=='W')
          {
            x--;
          }
          else{
            x++;
          }
       }
       int Xterm=(x*x);
       int Yterm=(y*y);
       return (float)Math.sqrt(Xterm+Yterm);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1="WNEENESENNN";
        System.out.println(displacement(str1));
    }
}