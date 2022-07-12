import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean sort = doYouWantToSort(input);
        int columns = howManyColumns(input);
        String fileName = getFileName(input);

        System.out.printf("sort: %s, columns: %s, fileName: %s",sort,columns,fileName);

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
                input.next();
            }

        }while(!valid);

        return user;
    }

    /**
     * Asks the user for the filename they wish to read.
     * @param input
     * @return String
     */
    public static String getFileName(Scanner input)
    {
        String user = "";
        System.out.println("Please type the file path, include the extension. If you want it to work that is.");
        user = input.next();
        return user;
    }

}
