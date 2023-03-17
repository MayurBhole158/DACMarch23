class Pattern17
{
    public static void main(String args[])
    {
		//Pattern17
		int n=5;
		int m=1;
		for(int i=1;i<=n;i++)//Row
        {
            for(int j=1;j<=i;j++)//Column
            {
				System.out.print(m+" ");
				m++;
            }
			System.out.println();
        }
	}
}