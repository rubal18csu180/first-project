class rectangle()
{
	int length,width;
	rectangle()
	{
		length=30;
		width=30;
	}
	
	int Area()
	{
	return length*width;
}


}
class box extends rectangle()
{
	int height;
	box()
	{
		height=10;
	}
	int vol()
	{
		return length*width*heighty;

	}
	int displaydim()
	{
		System.out.println("length "+length+"width "+width+"height "+height);
	}
}
class boxmain
{
	public static void main(String args[])
	{
	box b=new box();
	b.displaydim();
	System.out.println(b.vol());
	System.out.println(b.area());
    }
}
	
