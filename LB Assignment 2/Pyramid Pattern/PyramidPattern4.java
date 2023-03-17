class PyramidPattern4
{
	public static void main(String args[])
	{
	//Pyramid Pattern 4
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			for(int m=i-1;m>=1;m--)
			{
				System.out.print(m+ " ");
			}
			System.out.println("");
		}
	}
}