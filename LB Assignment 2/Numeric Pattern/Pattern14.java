class Pattern14
{
    public static void main(String args[])
    {
		//Pattern14
		int n=5;
		for(int i=n;i>=1;i--)//Row
        {
            for(int j=1;j<=i;j++)//Column
            {
            System.out.print(j+" ");
            }
			System.out.println();
        }
	}
}