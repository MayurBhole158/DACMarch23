class HollowFullPyramid
{
	public static void main(String args[])
	{
	//Hollow full Pyramid
		
		int n=15;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j||j==1||i==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println("");
		}
	}
}