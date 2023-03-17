class Pattern15
{
    public static void main(String args[])
    {
		//Pattern15
		int n=5;
		for(int i=1;i<=n;i++)//Row
        {
            for(int j=n;j>=i;j--)//Column
            {
            System.out.print(j+" ");
            }
			System.out.println();
        }
	}
}