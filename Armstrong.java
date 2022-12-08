class Armstrong
{
	public static void main(String args[])
	{
	int n=153,i,a=0,d=0,sum=0,r;
	r=n;
	while(r>0)
	{
	i=r%10;
	sum=i*i*i;
    a=sum+d;
    d=a;
	r=r/10;
	 System.out.print(a);
}
	if(a==n){
 System.out.print(" is armstrong");
	}
	else{
	 System.out.print(" is not armstrong");
	}
	}
}




















