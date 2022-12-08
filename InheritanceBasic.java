
class parent
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

class InheritanceBasic{
public static void main(String args[]){
	child c=new child();
	c.displayP();
	c.displayC();
	}
}