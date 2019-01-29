import java.util.*;
class distancemain
{
	public static void main(String args[])
	{
		float ff,ii,ff1,ii1;
        Scanner in =new Scanner(System.in);
        System.out.println("enter values in feet and inches");
        ff=in.nextInt();
        ii=in.nextInt();
        ff1=in.nextInt();
        ii1=in.nextInt();
        distance d=new distance();
        distance obf=new distance(ff1,ii1);
        distance obi=new distance(ff,ii);
        d=obf.sum(d);
        d=obi.sum(d);
        System.out.println("dist in feet "+d.f+"inch "+d.i);   
	}
}

	

