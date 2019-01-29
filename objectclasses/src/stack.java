class stack
{
	int st[];
	int top;
	stack()
	{
		st= new int[10];
		top=-1;
	}
    void push(int n)
    {
    	top++;
    	st[top]=n;
    	System.out.println("pushed element is "+st[top]);
    }
    void pop()
    {
    	if(top!=-1){
            int n1=st[top];
    	   top--;
        	System.out.println("deleted element is "+n1);
        }
    }
    void isEmpty()
    {
    	if(top==-1)
    		System.out.println("stack underflow");
    }
    void isFull()
    {
    	if(top==9)
    	System.out.println("stack overflow");
    }
}
	
