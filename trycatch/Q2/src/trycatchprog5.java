import java.util.*;
class AA
{
	String s;
	AA(String S)
	{
	s=S;
	}
	char string()
	{
	return(s.charAt(100));
	}
}
class  BB extends AA
{
	int a,b;
	BB(String s1,int aa,int bb)
	{
	super(s1);
	a=aa;
	b=bb;
	}
	char String()
	{
	return(s.charAt(a+b));
	}
}
class CC extends BB
{
  	CC(String s1,int aa,int bb)
  	{
  	super(s1,aa,bb);
  	}
  	char string()
  	{
  	return(s.charAt(1));
  	}
}
class trycatchprog5
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	try
	{
	System.out.println("enter string");
	String s2=in.nextLine();
	System.out.println("enter 2 no.s");
	int aa=in.nextInt();
	int bb=in.nextInt();
	CC ob=new CC(s2,aa,bb);
	ob=null;
	System.out.println(ob.string());
	}
	catch(Exception e)
	{
	System.out.println("task completed");
	}
	}
}