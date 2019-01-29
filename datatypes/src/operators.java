import java.util.*;
class operators
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("type 2 no.s");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int add=n1+n2;
		int div=n1/n2;
		int pro=n1*n2;
		int mod=n1%n2;
		int sub=n1-n2;
		System.out.println("addition is"+add);
		System.out.println("division "+div);
		System.out.println("modulus "+mod);
		System.out.println("multiplication"+pro);
		System.out.println("subtraction"+sub);
}
}
