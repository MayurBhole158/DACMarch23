class Pattern7
{
    public static void main(String args[])
	{
		int n=10;
		//Upper Triangle
		for(int i=1;i<=n;i++)//Row
        {
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//Column
            {
				System.out.print("*");
            }
			for(int m=2;m<=i;m++)
			{
				System.out.print("*");
            }
			System.out.println();
		}
		//Lower Triangle
		for(int i=1;i<=n-1;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int m=n-2;m>=i;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}