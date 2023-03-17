class PyramidPattern2
{
	public static void main(String args[])
	{
	//Pyramid Pattern 2
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
}