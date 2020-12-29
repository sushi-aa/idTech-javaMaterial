public class Toyota extends Car
{
    public static void main(String[] args)
    {
        /*
        Car t1 = new Car("Toyota", 1500);
        System.out.println(t1.getBrand());
        t1.setMiles(1600);
        System.out.println(t1.getMiles());

         */

        Toyota t1 = new Toyota();
        System.out.println(t1.brand);
        t1.brand = "Honda";
        System.out.println(t1.brand);
    }
}
