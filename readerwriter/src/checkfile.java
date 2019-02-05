import java.io.*;
public class checkfile
{
	public static void main(String args[])
	{
	try
	{
	 File f=new File("abc.java");
	 System.out.println(f.length());

	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}