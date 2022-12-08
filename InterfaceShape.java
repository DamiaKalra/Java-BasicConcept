interface shape
{
	float PI=3.14f;

  abstract void area();
}
//rectangle
class rectangle implements shape
{
	
	int length,breath;
	   rectangle(int l,int b){  
  length=l;
breath=b;  
      }  
public void area()
   {
	int a=length*breath;
		System.out.println("area is"+a);
    }
}
//circle
class circle implements shape
   {
	int radius;
	   circle(int r){  
  radius=r;  
    }  
public void area()
  {
	 //PI=4.76;
	 //cannot chnage the value of pi
	float a1=PI*radius*radius;
		System.out.println("area is "+a1);
   }
}
class InterfaceShape{
public static void main(String args[]){
rectangle r=new rectangle(5,6);
r.area();
/* by dynamic method dispatch
shape s= new rectangle();
s.area();*/

 circle c=new circle(3);
c.area();
}
}