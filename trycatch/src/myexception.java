class myexception extends Exception
{
	myexception(String s){
	super(s);
}
}
class checkexception
{
	public static void main(String args[])
	{
	try
	{
	throw new myexception("my own exception");
	}
	catch(myexception e)
	{
     System.out.println(e);
	}
	}
}