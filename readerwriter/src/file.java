import java.io.*;
class file
{
	public static void main(String args[])
	{
	File f=null;
	try
	{
      f=new File("file1.txt");
	FileReader fin=new FileReader(f);
	BufferedReader bin=new BufferedReader(fin);
	String sr;
	System.out.println("the contennts of file");
	while((sr=bin.readLine())!=null)
	{
	System.out.println(sr);
	}
	}
	catch(Exception e)
	{
	e.printStackTrace();
		}
	}
}