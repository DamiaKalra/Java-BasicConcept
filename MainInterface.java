interface  shape
{
abstract void area();
}
class rectangle implements shape
{
	
public void area()
{
System.out.println("i am rectangle ");
}
}
class MainInterface{
public static void main(String args[]){
 rectangle r=new rectangle();
r.area();
// by dynamic method dispatch
shape s= new rectangle();
s.area();
}
}