import java.util.*;
import java.lang.*;
class se5
{
  public static void main(String arg[])
   {
     try
         {
            String s;
            Scanner t=new Scanner(System.in);
	System.out.println("enter string");
	s=t.nextLine();
	StringBuffer sb=new StringBuffer(s);
	 sb.append(" Python Excerise");
	System.out.println(sb);
	 
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}