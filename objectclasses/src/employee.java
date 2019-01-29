import java.util.*;
class employee
{
	String firstname,lastname;
	double salary;
	employee(String fn,String ln,double d)
	{
		firstname=fn;
		lastname =ln;
		salary=d;
	}
	double yr_sal()
	{
		return(salary*12);
	}
	void salraise()
	{
		salary=salary*0.1;
	}
	void displayemp()
	{
		System.out.println("firstname "+firstname);
		System.out.println("lastname "+lastname);
		System.out.println("salary "+salary);
	}
}
class emp_main
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	String f,l;
	double s;
	System.out.print("enter first name  ");
	f=in.next();
	System.out.print("enter lastname  ");
	l=in.next();
    System.out.print("enter salary  ");
    do
    {
    	s=in.nextDouble();
    	if(s<0)
    		System.out.println("salary is a positive quantity,please enter again");
    }while(s<0);
    employee e1=new employee(f,l,s);
    e1.displayemp();
    e1.salraise();
    double dd=e1.yr_sal();
    System.out.println("annum salary "+dd);
}
}
