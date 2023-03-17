class Pattern16
{
    public static void main(String args[])
    {
		//Pattern16
		int n=5;
		for(int i=n;i>=1;i--)//Row
        {
            for(int j=n;j>=i;j--)//Column
            {
            System.out.print(j+" ");
            }
			System.out.println();
        }
	}
}