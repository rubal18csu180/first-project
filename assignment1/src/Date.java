class Date
{
	int day;
	int month;
	int year;
	Date(int a,int b,int c)
	{
		day=a;
		month=b;
		year=c;
	}
	Date()
	{
		day=0;
		month=0;
		year=0;
	}
	void display()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
}