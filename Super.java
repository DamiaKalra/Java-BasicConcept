 class A {
    String name;
    A(String name)
    {
        this.name = name;
    }
}
class B extends A {
    int id;
    B( String name,int id)
    {
		super(name);
        this.id = id;
    }
}
class C extends B{
	String city;
    C( String name,int id,String city)
    {
		super(name,id);
        this.city=city;
    }
}
class Super {
    public static void main(String[] args)
    {
        C c = new C("Damia", 1526,"Sangrur");
        System.out.println("Name :" + c.name
                           + " and Id :" + c.id+ " City :" + c.city);
    }
}

