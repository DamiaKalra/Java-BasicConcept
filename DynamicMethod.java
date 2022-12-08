
class parent
{
void displayP()	
{
	System.out.println("display of parent"); 
}
void display()
{
	System.out.println("i am display of parent"); 
}

}
class child extends parent
{
	void displayC()	
{
	System.out.println("display of child"); 
}
void display()
{
	System.out.println("i am display of child"); 
}

}

class DynamicMethodDispatch{
public static void main(String args[]){
	parent c=new child();
	c.displayP();
	c.display();
	//c.displayC();
	}
}