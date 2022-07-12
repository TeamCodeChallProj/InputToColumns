import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean sort = false;
        int columns = 0;
        sort = doYouWantToSort(input);
        columns = howManyColumns(input);

    }

    /**
     * Checks if the user wants to sort the text file or not.
     * @param input
     * @return boolean
     */
    public static boolean doYouWantToSort(Scanner input)
    {
        String user = "";
        System.out.printf("Do you wish to sort the list?\n" +
                "Please type y for yes or n for no\n");
        user = input.next();
        if(user.equalsIgnoreCase("y"))
            return true;
        return false;
    }

    /**
     * Checks how many columns the user wants to have.
     * @param input
     * @return int
     */
    public static int howManyColumns(Scanner input)
    {
        int user = 0;
        boolean valid = false;
        System.out.println("How many columns do you want?");

        do
        {
            try
            {
                user = input.nextInt();
                valid = true;
            } catch (Exception e)
            {
                System.out.println("Need to choose a number.");
            }

        }while(!valid);

        return user;
    }

}
