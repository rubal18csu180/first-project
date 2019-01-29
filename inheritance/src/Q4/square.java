class square extends rectangle
{
double side=0.0;
double len,wid;
  String s;
  square()
  {
   side=0.0;
  }
  square(double s)
  {
  side=s;
  }
  square(double s,String c,boolean f)
  {
  super(c,f);
  side=s;
  }
  double getSide()
  {
  return side;
  }
  void setSide(double ss)
  {
  side=ss;
  }
  
  setWidth(wid);
  setLength(len);
  tostring(s);
}