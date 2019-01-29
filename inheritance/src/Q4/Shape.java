public class Shape
{
   String colour="red";
   boolean filled=true;
   Shape()
   {
   	colour=" ";
   	filled=false;
   }
   Shape(String c,boolean f)
   {
   	colour=c;
   	filled=f;
   }
   String getColour()
   {
   	return colour;
   }
   void setColour(String cc)
   {
      colour=cc;
   }
   boolean isFilled()
   {
   	return filled;
   }
   void setFilled(boolean ff)
   {
     filled=ff;
   }
   String tostring()
   {
   	return(colour+" "+filled);
   }
}