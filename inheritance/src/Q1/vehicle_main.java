import java.util.*;
class vehicle_main
{
	public static void main(String args[])
	{
      Scanner in =new Scanner(System.in);
      System.out.println("enter the no. of tyres");
      int n=in.nextInt();
      vehicle ob=new vehicle();
      car ob1=new car();
      bike ob2=new bike();
      int a;
      switch(n)
      {
      	case 2:
      	ob2.display();
      	break;
      	case 4:
        ob1.display();
        break;
        default:
        ob.display();

      }
    }

}