public class jagged
{
	public static void main(String args[])
	{
	/*	int a=5,b=6,c=7,d=8;
		int x[]={5,6,7,8};
		int y[]={6,7,8,9};
		int z[]={7,8,9,6};
		
		int p[][]={
					{5,6,7,8},
					{6,7,8,9},
					{7,8,9,6}
		};
		
		for(int i[] : p)
		{
			for(int j : i )
			{
				System.out.print(j + " ");
			}
		}
	}
		System.out.println(""); */
		
		int a=5,b=6,c=7,d=8;
		int x[]={5,6,7,8};
		int y[]={6,7};
		int z[]={7,8,9};
		
		int k[][] = new int[3][];
		
		k[0] = new int[4];
		k[1] = new int[2];
		k[2] = new int[3];
		
		int p[][] ={
					{5,6,7,8},
					{6,7},
					{7,8,9}
		};
		
		for(int i[] : p)
		{
			for(int j : i)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}