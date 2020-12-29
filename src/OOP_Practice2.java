public class OOP_Practice2
{
    //attribute or global variable
    String name = "blue";
    public OOP_Practice2()
    {
        System.out.println("Constructor was called");
        name = "orange";
    }

    public OOP_Practice2(String n)
    {
        System.out.println("Constructor 2 was called");
        name = n;
    }

    public static void main(String[] args)
    {
        OOP_Practice2 oop2 = new OOP_Practice2();
        OOP_Practice2 oop3 = new OOP_Practice2("red");
        //oop2.name = "yellow";
        System.out.println(oop2.name);
        System.out.println(oop3.name);
        oop2.printSomething();
        oop3.printSomething();
    }

    public void printSomething()
    {
        System.out.println("this method has been called");
    }

}
