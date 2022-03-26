class ArrayDemo
{
	public static void main(String args[])
	{
		String[] copyFrom = {
		"Affogato" , "America" , "Cappuccino" , " Corretto" , "Cortado"
		, "Doppio" , "Espresso" , "Frappucino", " Freddo" , "Lungo" , "Macchi" ,
		"Marocchino" , "Ristretto" };
		
		String[] copyTo = new String[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		for(String coffee : copyTo)
		{
			System.out.print(coffee + " ");
		}
		
		}
	}
