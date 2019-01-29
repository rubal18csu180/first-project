import java.io.*;
class avgarray
{

	public static void main(String args[])throws IOException
	{
		float a[][]=new float[10][10];
		float b[]=new float[25];
		float c[]=new float[30];
		int i,j,k=0;
		float sum1=0,sum=0;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("enter marks of each student in each subject");

		for(i=0;i<10;i++)
		{
			for(j=0;j<5;j++)
			{
		        a[i][j]=Float.parseFloat(in.readLine());
		 }
		}
		System.out.println("sbu1 sbu2 sbu3 sbu4 sbu5 avg of each stu");
		for(i=0;i<5;i++)
		{
			for(j=0;j<10;j++)
			{
              
              sum1=sum1+a[j][i];
			}
			avg=sum1/10;
			c[k]=sum1;
			sum1=0;
			k++;
		}
        for(i=0;i<10;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.print(c[]);
			sum=0;
			System.out.println();
		}
		for(i=0;i<=k;i++)
		{
		System.out.print(c[i]+" ");
	    }
	    System.out.print("avg of each subject");
      }
              
}

