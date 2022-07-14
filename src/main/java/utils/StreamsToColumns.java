package utils;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsToColumns
{
    public static ArrayList<Stream<String>> readStream(Stream<String> file, int columns)
    {
        long size = file.count();
        long rows = (size - (size % columns)) / columns;
        ArrayList<Stream<String>> ret = new ArrayList<>();
        for(int i = 0; i < columns; i++)
        {
            if(file.skip(rows * i).count() % rows == 0)
                ret.add(file.skip(rows * i).limit(rows));
            else
                ret.add(file.skip(rows * i).limit(file.skip(rows * i).count()));
        }
        return ret;
    }

}
