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
        super(name);//super as a function is used to call base class constructor
        this.id = id;
    }
}
class MainConstructor {
    public static void main(String[] args)
    {
        B a = new B("Damia", 1526);
        System.out.println("Name :" + a.name
                           + " and Id :" + a.id);
    }
}

