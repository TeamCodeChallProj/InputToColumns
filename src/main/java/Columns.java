import java.util.ArrayList;

public class Columns {

    static public ArrayList<String[]> printColumns(ArrayList<String> numbers)
    {
        int elementNums = (int) numbers.stream().count();
        int columnNum = 1;
        while ((columnNum * columnNum * columnNum) <= elementNums)
        {
            columnNum++;
        }
        int cubeNum = columnNum * columnNum * columnNum;
        int currentNum = 0;

        ArrayList<String[]> columns = new ArrayList<>();
        for (int i = 0; i < columnNum; i++)
        {
            if (currentNum < elementNums)
            {
                if ((currentNum + (columnNum * columnNum)) < (elementNums))
                {
                    int temp = cubeNum / columnNum;
                    columns.add(new String[temp]);
                    currentNum += temp;
                }
                else
                {
                    int temp = (elementNums - currentNum);
                    columns.add(new String[temp]);
                    currentNum += temp;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < columns.size(); i++)
        {
            for (int j = 0; j < columns.get(i).length; j++)
            {
                columns.get(i)[j] = numbers.get(k);
                k++;
            }
        }
        return columns;
    }
}
