import java.util.Scanner;
public class JavaBasics2
{
    public static void main(String[] args)
    {
        //one line comment
        /*
        you can write
        as many lines
        as you want
        within that
         */

        /*
        System.out.println("Hello");
        int age = 13;
        System.out.println(age);

        String name = "Mia";
        System.out.println(name + " is " + age + " years old");

        int sum = 13 + 18;
        int difference = 18-13;
        int multiply = 13*18;

        double divide = 15 / 2;
        System.out.println(divide);

        double remainder = 15 % 2; //% this symbol is called modulus
        System.out.println(remainder);

        System.out.print("Hello");
        System.out.println(" this will be on the same line as Hello");

        boolean b = false;
        b = !b; //! means "not" and converts the boolean to its opposite value
        System.out.println(b);

        String n = "arushi";
        if (n == "mia")
        {
            System.out.println("Hello Mia");
        }
        else if (n == "arushi")
        {
            System.out.println("Hello Arushi");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String user_name = in.nextLine();

        if (user_name == "Arushi")
        {
            System.out.println("The double equals sign worked");
        }
        else if (user_name.equals("Arushi"))
        {
            System.out.println("The .equals() method worked");
        }

        */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your grade in percent: ");
        int grade = in.nextInt();

        if (grade < 50)
        {
            System.out.println("F");
        }
        else if (grade >= 50 && grade < 70) //&& represents "and"
        {
            System.out.println("D");
        }
        else if (grade >= 70 && grade < 80)
        {
            System.out.println("C");
        }
        else if (grade >= 80 && grade < 90)
        {
            System.out.println("B");

        }
        else
        {
            System.out.println("A");
        }

        System.out.println("Enter a number representing the day of the week ");
        int day_number = in.nextInt();
        /*
        have if-else statements that compare the number to the day of the week
        for example, 1 will be Monday
        2 will be Tuesday
        6 will be Saturday
        etc
        it will print the name of the day
         */

    }
}
