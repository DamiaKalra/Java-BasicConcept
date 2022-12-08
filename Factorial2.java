class Factorial2
{
public static void main(String args[])
{
	int num=1;
	for(int i=7; i>=1; i--)
	{
		System.out.print(i+"*");
	 num=i*num;
	}
	System.out.println("\b=" + num);
}
}
