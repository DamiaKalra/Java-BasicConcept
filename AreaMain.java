class Area
{
		void area(int a)
		{
				System.out.println("area of square "+a*a); 
		}
			void area(int a,int b)
		{
		System.out.println("area of rectangle "+a*b); 
		}
			void area(int a,int b,int c)
		{
			System.out.println("area of cube "+a*b*c); 
}
}
class AreaMain{
public static void main(String args[]){
		Area o=new Area();
	o.area(89);
	o.area(23,23);
	o.area(22,34,76);
}
}