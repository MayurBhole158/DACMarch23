class HollowInvertedHalfPyramid
{
	public static void main(String args[])
	{
	//Hollow Inverted Half Pyramid	
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				if(i==1||j==n||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}