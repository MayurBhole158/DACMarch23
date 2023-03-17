class Pattern10
{
    public static void main(String args[])
    {
		//Pattern10
		int n=5;
		int alpha =  65;
		for(int i=1;i<=n;i++)//Row
        {
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
            for(int j=n-i;j<=n-1;j++)//Column
            {
            System.out.print((char)(alpha+j)+" ");
            }
			System.out.println();
		}	
	}
}