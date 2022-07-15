import java.util.HashMap;
import java.util.stream.IntStream;

public class ConvertThis {

    public ConvertThis() {

        IntStream.rangeClosed(0, 99).forEach(i -> wordToNumberMap.put(numberToWord(i), i));

    }

    private static final String[] single_digits = new String[]{
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    private static final String[] two_digits = new String[]{
            "", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens_multiple = new String[]{
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final HashMap<String, Integer> wordToNumberMap = new HashMap<>(100);

    public String numberToWord(int number) {

        char[] num = Integer.toString(number).toCharArray();
        int len = num.length;

        if (number == 0)
            return "zero";

        if (len == 1)
            return single_digits[num[0] - '0'];

        int x = 0;
        StringBuilder result = new StringBuilder();
        while (x < num.length) {

            if (num[x] - '0' == 1) {
                return two_digits[num[x] - '0' + num[x + 1] - '0'];
            } else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
                return "twenty";
            } else {

                int i = (num[x] - '0');
                if (i > 0)
                    result.append(tens_multiple[i].trim()).append(" ");

                ++x;

                if (num[x] - '0' != 0)
                    result.append(single_digits[num[x] - '0'].trim());

            }

            ++x;

        }

        return result.toString().trim();

    }

    public Object wordToNumber(String str) {
        //return wordToNumberMap.get(str);
        return wordToNumberMap.getOrDefault(str.toLowerCase(), null);
    }

}
