
interface A{  
public void A();  
}  
interface B{  
public void B();  
}  
 class C{  
public void display()
{
	System.out.print(" class C");
}
  
}
class Z extends C implements A,B{  
public void A(){System.out.print("Hey");}  
public void B(){System.out.print(" Damia");}  
public void C(){System.out.print(" Kalra!");} 
}
  class InterfaceMultiple{
public static void main(String args[]){  
Z obj = new Z();  
obj.A();  
obj.B(); 
obj.C();
 }  
}  
