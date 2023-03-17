class InvPyramidPattern6
{
	public static void main(String args[])
	{
	//Inverted Pyramid Pattern-6
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}