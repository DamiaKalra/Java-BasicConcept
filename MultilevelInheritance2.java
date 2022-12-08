

class grandparent
{
//default
		 grandparent()
	{
     System.out.println("default constructor of grandparent"); 
	}
void displayGP()	
{
	System.out.println("display of grandparent"); 
}
}
class parent extends grandparent
{
//default
		 parent()
	{
        System.out.println("default constructor of parent"); 	
	}
	void displayP()	
{
	System.out.println("display of parent"); 
}
}
class child extends parent
{
//default
		child()
	{
System.out.println("default constructor of of grandparent"); 
	}
	void displayC()	
{
	System.out.println("display of child"); 
}
}


class MultilevelInheritance2{
public static void main(String args[]){
	child c=new child();
	c.displayGP();
	c.displayC();
		c.displayP();
	}
}
