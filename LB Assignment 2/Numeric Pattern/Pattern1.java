class Pattern1
{
    public static void main(String args[])
    {
		//Pattern1
		int n=5;
		for(int i=1;i<=n;i++)//Row
        {
            for(int j=1;j<=i;j++)//Column
            {
            System.out.print(j+" ");
            }
			System.out.println();
        }
	}
}