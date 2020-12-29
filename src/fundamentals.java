import java.util.Scanner;

public class fundamentals
{
    public static void main(String[] args)
    {
        /*
        System.out.println("hello");
        String name = "Arushi";
        int age = 18;
        System.out.println(name + " " + age);
        */

        //doubles, booleans, char, etc...

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        //System.out.println(age);

        if (age < 10)
        {
            System.out.println("Age is less than 10");
        }
        else if (age >= 10 && age < 18) // or is ||
        {
            System.out.println("Age is 10 or more, but less than 18");
        }
        else {
            System.out.println("Age is 18 or more");
        }


        // for i in range(0, 10)
        // ^ print out the numbers 0 to 9
        for (int i = 0; i < 10; i++)
        {
            System.out.print(i + "\t"); //escape sequence 
        }

        printStuff();

        //String n = getName(); //camel case
        //System.out.println(n);

        System.out.println( getName() );

        System.out.println( twiceAge(10) );

    }

    public static int twiceAge(int a)
    {
        return 2*a;
    }

    public static void printStuff()
    {
        System.out.println("\nThis method has been called");
    }

    public static String getName()
    {
        return "Arushi";
    }

}
