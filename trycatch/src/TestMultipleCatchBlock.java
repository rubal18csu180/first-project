import java.util.*;
class TestMultipleCatchBlock
{
	public static void main(String args[])
	{
	try
	{
	int a[]=new int[5];
	a[4]=30/2;
	Scanner in=new Scanner(System.in);
	int b=in.nextInt();
	}
	catch(ArithmeticException e)
	{
	System.out.println("task 1 completed");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("task 2 completed");
	}
	catch(Exception e)
	{
	System.out.println("common task completed");
	}
	System.out.println("rest of the code....");
	}
}
