abstract class shape
{
	int radius;
abstract void area();
}
//rectangle
class rectangle extends shape
{
	
public void area()
{
System.out.println("i am rectangle ");
}
}
//circle
class circle extends shape
{
	int radius;
	   circle(int r){  
  radius=r;  
    }  
final static float PI=3.14f;
public void area()
{
	float a1=PI*radius*radius;
		System.out.println("area is "+a1);
System.out.println("i am circle ");
}
}
class AbstractShape{
public static void main(String args[]){
 /*rectangle r=new rectangle();
r.area();
// by dynamic method dispatch
shape s= new rectangle();
s.area();*/

 circle r=new circle(3);
r.area();
}
}