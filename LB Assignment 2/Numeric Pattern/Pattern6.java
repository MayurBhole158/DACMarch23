class Pattern6
{
    public static void main(String args[])
    {
		//Pattern6
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
			System.out.println();
		}
	}
}