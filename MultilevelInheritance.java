

class grandparent
{
void displayGP()	
{
	System.out.println("display of grandparent"); 
}
}
class parent extends grandparent
{
	void displayP()	
{
	System.out.println("display of parent"); 
}
}
class child extends parent
{
	void displayC()	
{
	System.out.println("display of child"); 
}
}


class MultilevelInheritance{
public static void main(String args[]){
	child c=new child();
	c.displayGP();
	c.displayC();
		c.displayP();
	

	}
}

