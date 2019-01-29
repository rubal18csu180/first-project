class Project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	int resno;
	String[] respon;
	Project(String a,Date b,Date c,String d,int e,String[] f)
	{
		name=a;
		startDate=b;
		endDate=c;
		role=d;
		resno=e;
		respon=new String[resno];
		for(int i=0;i<resno;i++)
		{
			respon[i]=f[i];
		}
	}
	Project(String a,Date b,Date c,String d)
	{
		name=a;
		startDate=b;
		endDate=c;
		role=d;
	}
	Project()
	{
		
		name=null;
		startDate= new Date();
		endDate=new Date();
		role=null;
		respon=null;
		resno=0;
	}
	void display()
	{
		System.out.println(name);
		startDate.display();
		endDate.display();
		System.out.println("Role :"+role);
		if(resno>=1)
		{
			System.out.println("respon :");
			for(int i=0;i<resno;i++)
			{
				System.out.println((i+1)+". "+respon[i]);
			}
		}	
	}
}
