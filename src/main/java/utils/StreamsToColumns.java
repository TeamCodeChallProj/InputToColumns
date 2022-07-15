package utils;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsToColumns
{
    public static ArrayList<ArrayList<String>> readStream(Stream<String> file2, int columns)
    {
        ArrayList<String> file = file2.collect(Collectors.toCollection(ArrayList::new));
        
        long size = file.size();
        long rows = ((size - (size % columns)) / columns) + 1;
        ArrayList<ArrayList<String>> ret = new ArrayList<>();
        for(int i = 0; i < columns; i++)
        {
            if(file.stream().skip(rows * i).count() % rows != 0)
                ret.add(file.stream()
                    .skip(rows * i)
                    .limit(rows)
                    .collect(Collectors.toCollection(ArrayList::new)));
            else
                ret.add(file.stream()
                    .skip(rows * i)
                    .limit(file.stream()
                        .skip(rows * i)
                        .count())
                    .collect(Collectors.toCollection(ArrayList::new)));
        }
        return ret;
    }
    
    
    private static String rightPadding(String string, int len, char chr) {
        return ( len > string.length()) ? rightPadding(string + chr, len, chr) : string;
    }
    public static void PrintColumns(ArrayList<ArrayList<String>> rows) {
        int columnLength = rows.get(0).size();
        ArrayList<StringBuilder> stringBuilders = new ArrayList<>();
        StringBuilder ret = new StringBuilder();
        String curBiggest = "";
        for (int x = rows.size() - 1; x >= 0; x--)
        {
            for (int y = rows.get(x).size() - 1 ; y >= 0; y-- ) {
                if (rows.get(x).get(y).length() > curBiggest.length()) {
                    curBiggest = rows.get(x).get(y);
                }
            }
        }
        final String biggest = curBiggest;
        
        for (int i = 0; i < columnLength; i++)
        {
          stringBuilders.add(new StringBuilder());
        }
        
        
        
        rows.forEach(row -> {
            for (int i = 0; i < stringBuilders.size(); i++)
            {
                stringBuilders.get(i).append(rightPadding(row.size() != i ? row.get(i) : "", biggest.length(), ' ')).append("\t\t");
            }
        });
        
        for (StringBuilder stringBuilder : stringBuilders)
        {
            ret.append("\n").append(stringBuilder);
        }
        
        System.out.println(ret);
    }
    
}
