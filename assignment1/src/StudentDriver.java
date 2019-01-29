import java.util.*;
class StudentDriver
{
	public static void main(String args[])
	{
		String fname,lname,adline1,adline2,adcity,adstate,qname,uni,insti;
		String yn,pname,role,email,cont;
		int pin,date,month,year,sknum,qunum,prnum,sd,sm,sy,ed,em,ey,resno,l=0;
		float cgpa;
		Scanner sc=new Scanner(System.in);
		Scanner isc=new Scanner(System.in);
		System.out.println("Enter First Name of the student");
		fname = sc.nextLine();
		System.out.println("Enter Last Name of the student");
		lname = sc.nextLine();
		System.out.println("Enter address line 1");
		adline1= sc.nextLine();
		System.out.println("Enter address line 2");
		adline2 = sc.nextLine();
		System.out.println("Enter city");
		adcity = sc.nextLine();
		System.out.println("Enter State");
		adstate=sc.nextLine();
		System.out.println("Enter pin code");
		pin= isc.nextInt();
		Address ad=new Address(adline1,adline2,adcity,adstate,pin);
		System.out.println("Enter date of birth in the order: date/month/year");
		date=isc.nextInt();
		month=isc.nextInt();
		year=isc.nextInt();
		Date dob=new Date(date,month,year);
		System.out.println("How many skills do you want to enter ?");
		do{
			if(l>0)
				System.out.println("Atleast 1 skill is required");
			sknum=isc.nextInt();
			l++;
		}
		while(sknum<1);
		l=0;
		String[] skill=new String[sknum];
		for(int i=0;i<sknum;i++)
		{
			System.out.println("Enter skill no. "+(i+1));
			skill[i]=sc.nextLine();
		}
		System.out.println("How many Qualifications do you want to enter ?");
		do{
			if(l>0)
				System.out.println("Atleast 1 Qualification is required");
			qunum=isc.nextInt();
			l++;
		}
		while(qunum<1);
		l=0;
		Qualification[] quali=new Qualification[qunum];
		for(int i=0;i<qunum;i++)
		{
			System.out.println("Enter Qualification no. "+(i+1)+ " name");
			qname=sc.nextLine();
			System.out.println("Enter Qualification no. "+(i+1)+ " university");
			uni=sc.nextLine();
			System.out.println("Enter Qualification no. "+(i+1)+ " institute");
			insti=sc.nextLine();
			System.out.println("Enter Qualification no. "+(i+1)+ " CGPA");
			cgpa=isc.nextFloat();
			quali[i]=new Qualification(qname,uni,insti,cgpa);
		}
		System.out.println("How many projects do you want to enter ?");
		prnum=isc.nextInt();
		Project[] pro=new Project[prnum];
		if(prnum>0)
		{
			for(int i=0;i<prnum;i++)
			{
				System.out.println("Enter Project no. "+(i+1)+ " name");
				pname=sc.nextLine();
				System.out.println("Enter Project no. "+(i+1)+ " start date");
				sd=isc.nextInt();
				sm=isc.nextInt();
				sy=isc.nextInt();
				Date start=new Date(sd,sm,sy);
				System.out.println("Enter Project no. "+(i+1)+ " end date");
				ed=isc.nextInt();
				em=isc.nextInt();
				ey=isc.nextInt();
				Date end=new Date(ed,em,ey);
				System.out.println("Enter your role in project no. "+(i+1));
				role=sc.nextLine();
				System.out.println("How many responsibilities did you have in project no. "+(i+1));
				do{
					if(l>0)
					System.out.println("Atleast 1 responsibility is required");
					resno=isc.nextInt();
					l++;
				}
				while(resno<1);
				String[] res= new String[resno];
				for(int k=0;k<resno;k++)
				{
					System.out.println("Enter responsibility no. "+(i+1));
					res[k]=sc.nextLine();
				}
				pro[i]=new Project(pname,start,end,role,resno,res);
			}
		}	
		System.out.println("Enter your email address");
		email=sc.nextLine();
		System.out.println("Enter your contact no.");
		cont=sc.nextLine();
		Student s1;
		if(prnum>0)
			{
				System.out.println(sknum);
				s1=new Student(fname,lname,ad,dob,skill,sknum,quali,qunum,pro,prnum,email,cont);
			}
		else
			{
				System.out.println(sknum);
				s1=new Student(fname,lname,ad,dob,skill,sknum,quali,qunum,email,cont);			
			}
		s1.display();
	}
}