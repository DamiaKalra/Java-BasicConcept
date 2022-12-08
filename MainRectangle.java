class RectangleClasses{
	int length;
	int breath;
		//default constructor
		RectangleClasses()
		{
			length=8;
			breath=9;
		}
		//parametrized constructor
	/*rectangle(breath)
	{
			length=breath;
	}*/
		void display()
	{
	System.out.println("Length is "+length+"breath "+breath);
	}
	void area()
	{
		int a=length*breath;
		System.out.println("area is"+a);
	}
	//parameter
		void parameter()
	{
		int p=2*(length+breath);
		System.out.println("parameter is"+p);
	}
	}
	
	
	
class CircleClasses{
	int radius;
		//default constructor
		CircleClasses()
		{
			radius=5;
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
	
	class MainRectangle{
public static void main(String args[]){
	RectangleClasses R=new RectangleClasses();
	R.display();
	R.area();
	R.parameter();
    System.out.println("\n");
	//rectangle r2=new rectangle(20);
	//r2.display();
	CircleClasses c=new CircleClasses();
	c.display1();
	c.area1();
	c.parameter1();
	}
}


	