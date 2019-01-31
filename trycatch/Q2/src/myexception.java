class myexception extends exception
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
	throw new exception("my own exception");
	}
	catch(myException e)
	{
     System.out.println(e);
	}
	}
}