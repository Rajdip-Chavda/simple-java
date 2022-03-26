class LogicalOpTable
{
	public static void main(String args[])
	{
		boolean p,q;
		System.out.println("p\tq\tAND\tOR\tXOR\tNOT");
		
		p = true; q= true;
		System.out.println(p + "\t" + q);
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\n");
		
		p = true; q= false;
		System.out.println(p + "\t" + q);
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\n");
		
		p = false; q= true;
		System.out.println(p + "\t" + q);
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\n");
		
		p = false; q= false;
		System.out.println(p + "\t" + q);
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}
}

