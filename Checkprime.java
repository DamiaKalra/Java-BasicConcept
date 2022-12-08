class Checkprime
{
public static void main(String args[])
{
int n=9;
int i;
int c=0;
for(i=1;i<n/2;i++)
{
	if(n%i==0)
	{
		c++;
	}
}
if(c>1)
{
		System.out.print("not a prime no");
}
else
{
	System.out.print("is a prime no");
}
}
}