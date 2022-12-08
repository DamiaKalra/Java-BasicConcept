abstract class shape
{
abstract void area();
}
class rectangle extends shape
{
	
public void area()
{
System.out.println("i am rectangle ");
}
}
class MainAbstract{
public static void main(String args[]){
 rectangle r=new rectangle();
r.area();
// by dynamic method dispatch
shape s= new rectangle();
s.area();
}
}