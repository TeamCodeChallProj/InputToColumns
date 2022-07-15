import utils.InputRead;
import utils.StreamsToColumns;

import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;


public class Main
{
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		boolean sorted;
		int columns;
		String fileName;
		
		Optional<Boolean> optionalSorted = Optional.empty();
		Optional<Integer> optionalColumns = Optional.empty();
		Optional<String> optionalFileName = Optional.empty();
		
		for (String arg : args)
		{
			var argVal = arg.substring(arg.indexOf('=') + 1);
			
			if (arg.startsWith("--sorted="))
			{
				optionalSorted = Optional.of(argVal.equals("true"));
			}
			if (arg.startsWith("--columns="))
			{
				try
				{
					optionalColumns = Optional.of(Integer.parseInt(argVal));
				}
				catch (NumberFormatException exception)
				{
					System.out.println(argVal + "is not a valid number.");
				}
			}
			if (arg.startsWith("--file="))
			{
				optionalFileName = Optional.of(argVal);
			}
		}
		
		
		sorted = optionalSorted.orElseGet(Main::doYouWantToSort);
		columns = optionalColumns.orElseGet(Main::howManyColumns);
		fileName = optionalFileName.orElseGet(Main::getFileName);
		
		
		if (columns > 5 || columns < 2) {
			System.out.println("Columns must be a value between 2 or 5.");
			return;
		}
		//System.out.printf("sort: %s, columns: %s, fileName: %s",sorted,columns,fileName); For Debug Purposes
		StreamsToColumns.PrintColumns(StreamsToColumns.readStream(!sorted ? Objects.requireNonNull(InputRead.readFile(fileName)) : Objects.requireNonNull(InputRead.readFile(fileName)).sorted(), columns));
	}
	
	/**
	 * Checks if the user wants to sort the text file or not.
	 * @return boolean
	 */
	private static boolean doYouWantToSort()
	{
		String user;
		System.out.print("Do you wish to sort the list?\n" + "Please type y for yes or n for no\n");
		user = input.next();
		return user.equalsIgnoreCase("y");
	}
	
	/**
	 * Checks how many columns the user wants to have.
	 * @return int
	 */
	private static int howManyColumns()
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
			}
			catch (Exception e)
			{
				System.out.println("Need to choose a number.");
				input.next();
			}
			
		}
		while (!valid);
		
		return user;
	}
	
	/**
	 * Asks the user for the filename they wish to read.
	 * @return String
	 */
	private static String getFileName()
	{
		System.out.println("Please type the file path, include the extension. If you want it to work that is.");
		return input.next();
	}
	
	
}
