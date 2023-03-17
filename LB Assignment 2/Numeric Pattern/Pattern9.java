class Pattern9
{
    public static void main(String args[])
    {
		//Pattern9
		int alpha =65;
		int n=5;
		for(int i=0;i<=n-1;i++)
		{
			for(int k=n-1;k>=i+1;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}	
	}
}