import java.util.Optional;

public class Main
{
	public static void main(String[] args)
	{
		boolean sorted;
		int columns;
		String fileName;
		
		Optional<Boolean> optionalSorted;
		Optional<Integer> optionalColumns;
		Optional<String> optionalFileName;
		
		for (String arg : args)
		{
			var argVal = arg.substring(arg.indexOf('=') + 1);
			
			System.out.println(argVal);
			
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
		
		
	}
}
