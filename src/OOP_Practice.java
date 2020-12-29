public class OOP_Practice
{

    //global variable
    int x;

    public OOP_Practice()
    {
        x = 10;
    }

    public OOP_Practice(int y)
    {
        x = y;
    }


    String name = "instance of OOP_Practice";
    public static void main(String[] args)
    {
        OOP_Practice oop_obj = new OOP_Practice();
        OOP_Practice oop_obj2 = new OOP_Practice();
        OOP_Practice oop_obj3 = new OOP_Practice(20);
        oop_obj.x = 50;
        System.out.println(oop_obj.x);
        System.out.println(oop_obj2.name);
        System.out.println(oop_obj2.x);
        System.out.println(oop_obj3.x);

        oop_obj.printStatement();
    }

    public void printStatement()
    {
        System.out.println("This method has been called and it is not static ");
    }

    //access modifiers:
    // private -- the code is only accessible to THIS PARTICULAR class
    // public -- all code is accessible to any and every class
    // default -- all code accessible to anything in the package
    // protected -- all code is accessible to anything in the package AND any subclasses

    //for private classes, we have getter and setter methods

}
