class Overload
{
		void sum(int a,int b)
		{
				System.out.println("sum of interger "+a+b); 
		}
			void sum(float a,int b)
		{
		System.out.println("sum of float "+a+b); 
		}
			void sum(double a,double b)
		{
			System.out.println("sum of double "+a+b); 
}
}
class OverloadMain{
public static void main(String args[]){
		Overload o=new Overload();
	o.sum(8976.543f,23456);
	o.sum(2345.2345,2345.2345);
	o.sum(2234,345);
}
}
