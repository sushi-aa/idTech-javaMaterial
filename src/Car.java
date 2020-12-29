public class Car
{
    protected String brand;
    protected int miles;

    public Car()
    {
        brand = "Toyota";
        miles = 1500;
    }

    public Car(String b, int m)
    {
        brand = b;
        miles = m;
    }

    //getters and setters
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String newvalue)
    {
        brand = newvalue;
    }
    public int getMiles()
    {
        return miles;
    }
    public void setMiles(int newmileage)
    {
        miles = newmileage;
    }

    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car("Tesla", 2000);
        System.out.println(c1.brand); //c1.getBrand()
        System.out.println(c2.brand);
    }

    //private variables/methods are only accessible within the class in which they're declared
    //public are accessible to all classes
    //protected --> they are accessible within the class as well as any SUBCLASSES (inheritance)
}
