import java.util.*;
class character
{
	public static void main(String args[])
	{
		String s;
		int l;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        s=sc.nextLine();
        l=s.length();
        s=s.toLowerCase();
        if(l==1)
        {
        	if((s=="a")||(s=="e")||(s=="i")||(s=="o")||(s=="u"))
        		System.out.println("vowels");
        	else
        		System.out.println("consonants");
        }
        else
        	System.out.println("error");
}
}
