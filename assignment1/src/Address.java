class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;
	Address(String a,String b,String c,String d,int e)
	{
		line1=a;
		line2=b;
		city=c;
		state=d;
		pinCode=e;
	}
	Address()
	{
		line1=null;
		line2=null;
		city=null;
		state=null;
		pinCode=0;
	}
	void display()
	{
		System.out.println(line1+"\n"+line2+"\nCity: "+city+"\nState: "+state+"\t"+pinCode);
	}
}
