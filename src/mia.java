public class mia
{
    public static void main(String[] args)
    {
        for (int i=1; i<11; i++)
        {
            System.out.print(i + "\t");
        }

        System.out.println();
        for (int i = 20; i >= 0; i--)
        {
            System.out.print(i + "\t");
        }

        /*
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _

         */
        System.out.println();
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int row = 0; row < 5; row ++)
        {
            for (int col = 0; col < 5; col ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int row = 0; row < 5; row ++)
        {
            for (int col = 0; col <= row; col ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        practiceMethod();

        //String name = returnName();
        //System.out.println("The method ran and your name is: " + name);

        System.out.println("The method ran and your name is: " + returnName());

        int number = 10;
        System.out.println( squaring(number) );


    }

    public static int squaring(int s)
    {
        return s * s;
    }

    public static void practiceMethod()
    {
        System.out.println("This is a practice method ");
    }

    public static String returnName()
    {
        String name = "Mia";
        return name;

        //OR
        // return "Mia";
    }





}
