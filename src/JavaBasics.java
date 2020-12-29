import java.util.Scanner;
//Java Basics

//This is a comment


/*
This is how you do a multi-line comment
*/


/*
Every line of code in Java must be contained in a class.
Usually, classes are public.

System.out.println() signifies a print statement. As opposed to System.out.print(), println
will print the information in (), and then create a new line.

*/

import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {

        /*
        System.out.println("\nThis is a simple Java program!");
        System.out.print("This will not print on a new line");
        System.out.println("...so this will be right next to the previous statement");

        int x = 5;

        //not to be confused with a char, which would be in single quotes instead of double quotes
        String y = "Your Name";

        boolean z = true;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println();

        int a = 19;
        int b = 5;
        int c = a + b;
        c = a - b;
        c = a*b;
        c = a/b; //3
        c = a % b; //modulus produces remainder
        System.out.println(a % b);
        System.out.println(a / b);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( bool1 && bool2);
        //'and' operation will only be true when both booleans are true

        System.out.println( bool1 | bool2);
        //'or' operation will be true when EITHER one of the booleans is true


        //tryingThingsOut();
        //testOperators();
        //moreComplex();

        String name = "Evan";
        if (name == "Mia")
        {
            System.out.println("Your age is 15");
        }
        else if (name == "Arushi")
        {
            System.out.println("Your age is 18");
        }
        else if (name == "Evan") {
            System.out.println("Your age is 17");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int user_age = input.nextInt();
        // String name = input.nextLine() --> input for a string rather than integer

        if (user_age < 10)
        {
            System.out.println("you're a kid");
        }
        else if (user_age < 20 && user_age >=10)
        {
            System.out.println("you're a teenager");
        }
        else
        {
            System.out.println("you're an adult");
        }
        */

        int returned_age = return_age();
        System.out.println(returned_age);

        String returned_name = return_name(3);
        System.out.println(returned_name);
    }


/*
One thing to keep in mind: the name of the class MUST MATCH the file name.

The main method signature might look a little weird, but you don't need to be
able to understand all the keywords in there...yet
*/

//This is a comment
/*
This is how you do a multi-line comment
*/

    public static void tryingThingsOut() {
        System.out.println("As you notice, this method signature has 5 main components");
        System.out.println("Public | static | void | tryingThingsOut | ()\n");

    }

    public static void testOperators() {
        int a = 100 + 20;
        int b = 100 - 20;
        int c = 100 * 20;
        int d = 100 / 20; //THIS IS A SPECIAL ONE
        int e = 100 % 20; //ANOTHER SPECIAL ONE

        System.out.println(a + "    " + b + "    " + c + "    " + d + "    " + e);

    }


    public static void moreComplex()
    {
        for (int i = 0; i < 10; i++)
        {
            if (i == 5)
            {
                System.out.println("halfway there!");
            }
            System.out.println(i);


        }
    }

    public static int return_age()
    {
        return 15;
    }

    public static String return_name(int a)
    {
        if (a == 0)
        {
            return "Mia";
        }
        else
        {
            return "Evan";
        }

    }
}