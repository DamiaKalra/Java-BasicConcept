	
class CircleClass{
	int radius;
	static float pi;
	//parametrized constructor
	CircleClass(int radius)
	{
		{this.radius=radius;}
	}
				void display1()
	{
	System.out.println("radius is  "+radius);
	}
	//area
	void area1()
	{
		float a1=3.14f*radius*radius;
		System.out.println("area is "+a1);
	}
	//parameter
		void parameter1()
	{
		float p1=2*3.14f*radius;
	System.out.println("parameter is "+p1);
	}
}
class MainCircleStatic{
public static void main(String args[]){
	CircleClasses c=new CircleClasses();
	c.display1();
	c.area1();
	c.parameter1();
	}
}