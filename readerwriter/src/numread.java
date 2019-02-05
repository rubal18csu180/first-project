import java.io.*;
class numread
{
	  File f=null;
	  int a[];
	  void numfileread()
	  {
	    a=new int[10];
	  try
	  {
	    f=new File("data.txt");
	    FileReader fin=new FileReader(f);
	    BufferedReader bin=new BufferedReader(fin);
	    for(int i=0;i<10;i++)
	    {
          a[i]=Integer.parseInt(bin.readLine());
	    }
	  }
	  catch(Exception e)
	  {
	    for(int i=0;i<10;i++)
	    {
	      System.out.print(a[i]+" ");
	    }
	  }
	  }
	  int[] numsort()
	  {
	  	int i,j,temp;
	  	for(i=0;i<10;i++)
	  	{
	  		for(j=i+1;j<10;j++)
	  		{
	  			if(a[i]>a[j])
	  			{
	  			temp=a[i];
	  			a[i]=a[j];
	  			a[j]=temp;
	  		    }
	  		}
	  	}
	  	return a;
	   }
	   void display()
	   {
	   	int i;
	   	for(i=0;i<10;i++)
	   	{
	   		System.out.println(a[i]+" ");
	   	}
	   }
	   void write(int b[])
	   {
	   	try
	   	{
	   	f=new File("data.txt");
	   	FileWriter fout=new FileWriter(f);
	   	BufferedWriter bout=new BufferedWriter(fout);
	   	for(int i=0;i<10;i++)
	   	{
	   		bout.newLine();
	   		bout.write(b[i]);
	   	}
	   	bout.close();
	   }
	   catch(Exception e)
	   {
	   	e.printStackTrace();
	   }
	   }
}
class mainclass
{
	public static void main(String args[])
	{
	  numread nr=new numread();
	  nr.numfileread();
	 int a[]= nr.numsort();
	  nr.display();
	  nr.write(a);
	}
}
