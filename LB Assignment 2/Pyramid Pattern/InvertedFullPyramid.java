class InvertedFullPyramid
{
	public static void main(String args[])
	{
	//Inverted Full Pyramid
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}