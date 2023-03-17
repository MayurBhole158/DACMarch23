class Pattern18
{
    public static void main(String args[])
    {
		//Pattern18
		int n=5;
		for(int i=n;i>=1;i--)//Row
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