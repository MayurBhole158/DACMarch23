class Pattern13
{
    public static void main(String args[])
    {
		//Pattern13
		int n=5;
		char c = 'A';
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}	
	}
}