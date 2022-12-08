class printfac1to10
{
public static void main(String args[])
{
{
	for(int a=1; a<=10; a++)
	{
	   System.out.println(a+"=>");
	  {
	int count=1;
	for(int b=a; b>=1; b--)
	{
		System.out.print(b+"*");
	 count=b*count;
	}
	System.out.println("\b=" + count);
}
	}
}
}
}