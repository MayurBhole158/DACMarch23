class FullPyramid
{
	public static void main(String args[])
	{
	//Full Pyramid 
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}