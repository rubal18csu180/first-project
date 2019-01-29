class years
{
	public static void main(String args[])
	{
		int min,months,days,ymd;min=2405;
		int years;
		years=(int)min/360;
		min=min-(365*years);
		months=min/30;
		days=min-(months*30);
		System.out.println(years+"years"+months+"months"+days+"days");
	}
}

