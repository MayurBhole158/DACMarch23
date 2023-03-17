class Pattern5
{
    public static void main(String args[])
	{
		int n=5;
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
	}
}