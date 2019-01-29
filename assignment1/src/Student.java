class Student
{
	String firstName;
	String lastName;
	Address addr;
	Date dob;
	String [] skills;
	int skillsnum;
	Qualification[] qual;
	int qualnum;
	Project [] projects;
	int projectsnum;
	String eMail;
	String contactNo;
	Student()
	{
		firstName=null;
		lastName=null;
		addr = new Address();
		dob= new Date();
		skills=null;
		skillsnum=0;
		qualnum=0;
		projectsnum=0;
		qual= new Qualification[0];
		projects= new Project[0];
		eMail=null;
		contactNo=null;
	}
	Student(String a,String b,Address c,Date d,String[] e,int elen,Qualification[] f,int flen,Project[] g,int glen,String h,String i)
	{
		int k;
		firstName=a;
		lastName=b;
		addr = c;
		dob= d;
		skillsnum=elen;
		qualnum=flen;
		projectsnum=glen;
		skills=new String[skillsnum];
		qual=new Qualification[qualnum];
		projects=new Project[projectsnum];
		for(k=0;k<skillsnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]= f[k];
		}
		for(k=0;k<projectsnum;k++)
		{
			projects[k]= g[k];
		}
		eMail=h;
		contactNo=i;
	}
	
			Student(String a,String b,Address c,Date d,String[] e,int elen,Qualification[] f,int flen,String i,String j)
	{
		int k;
		firstName=a;
		lastName=b;
		addr = c;
		dob= d;
		skillsnum=elen;
		qualnum=flen;
		skills=new String[elen];
		qual=new Qualification[flen];
		for(k=0;k<skillsnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]= f[k];
		}
		eMail=i;
		contactNo=j;
	}
	void display()
	{
		System.out.println("Firstname :" +firstName);
		System.out.println("Lastname :" +lastName);
		System.out.println("Address :");
		addr.display();
		System.out.print("Date of birth : ");
		dob.display();
		System.out.println("Skills :");
		if(skillsnum>0)
		{
			for(int i=0;i<skillsnum;i++)
			{
				System.out.println((i+1)+". ");//+skills[i]);
			}
		}
		if(qualnum>0)
		{
			for(int i=0;i<qualnum;i++)
			{
				System.out.print((i+1)+". ");
				qual[i].display();
			}
		}
		if(projectsnum>0)
		{
			for(int i=0;i<projectsnum;i++)
			{
				System.out.println((i+1)+". ");
				projects[i].display();
			}
		}
		System.out.println("Email ID :"+eMail);
		System.out.println("Contact No. :"+contactNo);
	}
}
