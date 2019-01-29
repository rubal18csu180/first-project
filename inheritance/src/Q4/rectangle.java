public class rectangle extends Shape
{
	double width=1.0;
	double length=1.0;
	rectangle()
	{
	width=0.0;
	length=0.0;
	}
	rectangle(double w,double l)
    {
    width=w;
    length=l;
    }
    rectangle(double w,double l,String c,boolean f)
    {
      super(c,f);
      width=w;
      length=l;
    }
    double getWidth()
    {
    return width;
    }
    void setWidth(double ww)
    {
    width=ww;
    }
    double getLength()
    {
    	return length;
    }
    void setLength(double ll)
    {
    	length=ll;
    }
    double getArea()
    {
    return(length*width);
    }
    double getPerimeter()
    {
    return(2*(length+width));
    }
    String tostring()
    {
    return(length+" "+width);
    }
}