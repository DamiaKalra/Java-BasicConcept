class HierarchicalInheritance { 
	void DisplayA() { 
		System.out.println("parent class"); 
	} 
} 
class A extends HierarchicalInheritance { 
	void DisplayB() { 
		System.out.println("child class 1"); 
	} 
} 
class B extends HierarchicalInheritance { 
	void DisplayC() { 
		System.out.println(" child class 2"); 
	} 
} 

class HierarchicalInheritanceMain { 
	public static void main(String args[]) { 
		B b = new B(); 
		b.DisplayA(); 
		b.DisplayC(); 
		
		A a = new A(); 
		a.DisplayA();
		a.DisplayB();
	} 
} 