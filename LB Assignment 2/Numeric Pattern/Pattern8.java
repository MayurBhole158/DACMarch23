class Pattern8
{
    public static void main(String args[])
    {
		//Pattern8
		int n=5;
        for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}