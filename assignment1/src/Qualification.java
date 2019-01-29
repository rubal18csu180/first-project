class Qualification 
{
	String qualName;
	String university;
	String institute;
	float cgpa;
	Qualification(String a,String b,String c,float d)
	{
		qualName=a;
		university=b;
		institute=c;
		cgpa=d;
	}
	Qualification()
	{
		qualName=null;
		university=null;
		institute=null;
		cgpa=0;
	}
	void display()
	{
		System.out.println(qualName+"\n"+university+"\n"+institute+"\nCGPA :"+cgpa);
	}
}
