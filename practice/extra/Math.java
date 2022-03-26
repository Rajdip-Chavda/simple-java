import java.util.Scanner;
class Math
{
	public static void main(String args[])
	{
	int l,b,h;
	//int b=20;
	//int h=25;
			//System.out.println("l*b*h is " + d);
	Scanner sc = new Scanner(System.in);
	l=sc.nextInt();
	System.out.println("enter l : " + l);
	Scanner sc1 = new Scanner(System.in);
	b=sc1.nextInt();
	System.out.println("enter b : " + b);
	Scanner sc2 = new Scanner(System.in);
	h=sc2.nextInt();
	System.out.println("enter h : " + h);
	int d= l * b * h;
	System.out.println("l*b*h is " + d);
	
	}
}