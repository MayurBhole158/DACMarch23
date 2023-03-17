class Pattern5
{
    public static void main(String args[])
    {
		//Pattern5
		int n=5;
        char c = 'A';
        for(int i=1;i<=n;i++)//Row
        {
            for(int j=1;j<=i;j++)//Column
            {
            System.out.print(c+" ");
			
            }
			c++;
			System.out.println();
		}
	}
}