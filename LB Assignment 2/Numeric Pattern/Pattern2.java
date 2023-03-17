class Pattern2
{
    public static void main(String args[])
    {
		//Pattern2
		int n=5;
        for(int i=1;i<=n;i++)//Row
        {
			char c = 'A';
            for(int j=0;j<i;j++)//Column
            {
            System.out.print(c+" ");
			c++;
            }
			System.out.println();
		}
	}
}