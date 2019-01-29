public class circle extends Shape
{
	double radius=1.0;
	circle()
	{
	radius=0.0;
	}
	circle(double r)
    {
    radius=r;
    }
    circle(double r,String c,boolean f)
    {
      super(c,f);
      radius=r;
    }
    double getRadius()
    {
    return radius;
    }
    void setRadius(double rr)
    {
    radius=rr;
    }
    double getArea()
    {
    return(radius*radius);
    }
    double getPerimeter()
    {
    return(4*radius);
    }
    String tostring()
    {
    return(radius+" ");
    }
}