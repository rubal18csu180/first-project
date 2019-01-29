import java.util.*;
class stackmain
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner in=new Scanner(System.in);
		stack ob=new stack();
		System.out.println("enter 1 for push 2 for pop 3 for check empty 4 for check full");
        int ch=in.nextInt();
        switch(ch){
        	case 1:
        		System.out.println("enter element u want to add");
				n=in.nextInt();
        		ob.push(n);
        		break;
            case 2:
            ob.pop();
            break;
            case 3:
            ob.isEmpty();
            break;
            case 4:
            ob.isFull();
            break;
            default:
            System.out.println("error");
        }
		
	}
}
	
