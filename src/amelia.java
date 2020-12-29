import java.util.Scanner;
import java.util.Arrays;
public class amelia
{
    public static void main(String[] args)
    {
        // one-line comment
        /*
        you can write
        as many lines
        as you want
         */

        /*
        System.out.println("Hello");

        int age = 15;
        String name = "Amelia";
        boolean z = true;
        z = !z; //! means "not", converts to the opp value

        System.out.println(z);

        if (name == "Amelia")
        {
            System.out.println("It's Amelia");
        }
        else if (name == "Arushi")
        {
            System.out.println("It's me");
        }
        else
        {
            System.out.println("Nope");
        }

        //for i in range(0, 10)
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String n = input.nextLine();
        System.out.println(n);

        //create another scanner
        //an integer to hold the user input
        //prompting and getting input
        //for loop
        //print statement for the result

        System.out.println("Enter a number: ");
        int p = input.nextInt();
        boolean is_prime = true;

        //for loop that goes from i=2 to the number and checks if the number % i is 0
        //if thats true, change boolean to false
        //break out of loop (break;)
        //if else to check if the boolean is true or false
        //appropriate print statement


        int a = find_age();
        System.out.println(a);

        System.out.println( find_age() );
        System.out.println( find_name() );

        int to_double = 10;
        System.out.println( doubling(to_double) );


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        String b = "Amelia";
        if (b == "Amelia")
        {
            System.out.println("double equals worked with b");
        }

        if (name.equals("Amelia"))
        {
            System.out.println("double equals worked with user input");
        }

        int[] myArray = {2, 2, 4, 6, 1};
        String[] myArray2 = {"Amelia", "Arushi", "Max", "Nate"};

        int[][] a = new int[10][10];
        for (int i = 0; i<10; i++)
        {
            for (int j = 0; j< 10; j++)
            {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(myArray));
        int sum = 0;

        //for each loop
        for (int i : myArray)
        {
            sum += i;
        }
        System.out.println(sum);

         */

        int[] m = {2, 4, 6, 8, 10, 12};
        System.out.println(Arrays.toString(m));

        //remove the 2nd element, 1st index (value: 4)
        /*
        int removal = 1;
        for (int i=removal ; i < m.length - 1; i++)
        {
            m[i] = m[i+1];
        }
        System.out.println("After removal: " + Arrays.toString(m));
        */

        for (int i = 0; i< m.length / 2; i++)
        {
            int temp = m[i];
            m[i] = m[m.length - i - 1];
            m[m.length - i - 1] = temp;
        }
        System.out.println("After reversal: " + Arrays.toString(m));

        System.out.println( fact(4));

        System.out.println(sum(m, m.length));

        System.out.println(fib(5));

        practiceWithLoops();
    }

    public static int doubling(int n)
    {
        return 2 * n;
    }
    public static int find_age()
    {
        /*
        int age = 15;
        return age;
        */
        return 15;
    }

    public static String find_name()
    {
        String name = "Amelia";
        return name;
    }

    //arrays
    //recursion
    //bunch of practice with manipulating arrays in for loops

    public static int fact(int n)
    {
        System.out.println(n) ;
        if (n <= 1)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }

    public static int sum(int[] x, int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        else
        {
            return sum(x, n-1 ) + x[n-1];
        }
    }

    public static int fib(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1 || n == 2)
        {
            return 1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void practiceWithLoops()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print("the value of i is: " + i + "\t");
        }
        System.out.println("\n");
        //for each loop
        int[] numberArray = {2, 4, 6, 8, 10};
        for (int i: numberArray)
        {
            System.out.print(i + "\t");
        }
        //10, 20, 30, 40, 50, 60, 70, 80, 90, 100

    }

}
