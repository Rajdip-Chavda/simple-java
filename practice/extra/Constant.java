//use of final keyword.
//final keyword indicates that we can assign the value to variable and it will be set for all,
//it is customary to name constant in all UPPERCASE latter.

public class Constant
{
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String args[])
	{
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("paper size in centimeters : " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}	
}
