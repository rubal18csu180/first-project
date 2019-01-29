
class distance
{
	float f,i;
	distance()
	{
		f=0;
		i=0;
	}
	distance(float f1, float i1)
	{
		f=f1;
		i=i1;
	}
	distance sum(distance d)
	{
		d.f=d.f+f;
		d.i=d.i+i;
		return (d);
	}
}
