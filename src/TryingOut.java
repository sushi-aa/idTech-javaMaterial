//This is a comment

/*
this
is
a
multi
line
comment
 */


/*
public class TryingOut
{
    public static void main(String[] args)
    {
        System.out.println("\nFor trying things");
    }
}
*/

public class TryingOut
{
    public static void main(String[] args)
    {
        System.out.println("Hello Gratian");
        int age = 13;
        System.out.println(age);

        String n = "Gratian";
        System.out.println(n);

        //ints and strings above

        //boolean has only 2 values (True or False)

        boolean val = true;
        val = !val;
        System.out.println(val);

        age = myAge();
        System.out.println("the new age is " + age);

    }

    public static int myAge()
    {
        int age = 25;
        return age;
    }
}



