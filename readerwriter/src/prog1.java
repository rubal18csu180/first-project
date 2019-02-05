import java.io.*;
import java.util.*;
class prog1
{
	public static void main(String args[])
	{
	int sno;
	String firstname;
	char grade;
	File f=null;
	try
	{
	f=new File("file.txt");
	FileWriter fout=new FileWriter(f);
	BufferedWriter bout=new BufferedWriter(fout);
	Scanner sc = new Scanner(System.in);
	Scanner ip= new Scanner(System.in);
	System.out.println("enter a string");
	while(sc.hasNext())
	{
	
	firstname=sc.nextLine();
	bout.write(firstname+" ");
	double cgpa=ip.nextDouble();
	bout.write(cgpa+" ");
	grade=sc.next().charAt(0);
	bout.write(grade+" ");
	bout.write(ip.nextInt()+" ");
	}
	bout.close();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
}
}