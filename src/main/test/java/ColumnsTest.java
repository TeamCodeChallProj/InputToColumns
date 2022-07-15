import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColumnsTest {

    Columns test;

    @BeforeEach
    void setup()
    {
        test = new Columns();
    }

    @Test
    void testSizeSeven()
    {
        ArrayList<String> testStrings = new ArrayList<>();
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        ArrayList<String[]> testArray = test.printColumns(testStrings);
        int columns = testArray.size();
        int col1 = testArray.get(0).length;
        int col2 = testArray.get(1).length;

        assertEquals(2, columns, "printColumns() gives wrong number of columns");
        assertEquals(4, col1, "printColumns() fills columns wrong");
        assertEquals(3, col2, "printColumns() fills columns wrong");
    }

    @Test
    void testSizeTwentyFive()
    {
        ArrayList<String> testStrings = new ArrayList<>();
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        ArrayList<String[]> testArray = test.printColumns(testStrings);
        int columns = testArray.size();
        int col1 = testArray.get(0).length;
        int col2 = testArray.get(1).length;
        int col3 = testArray.get(2).length;

        assertEquals(3, columns, "printColumns() gives wrong number of columns");
        assertEquals(9, col1, "printColumns() fills columns wrong");
        assertEquals(9, col2, "printColumns() fills columns wrong");
        assertEquals(7, col3, "printColumns() fills columns wrong");
    }

    @Test
    void testSizeForty()
    {
        ArrayList<String> testStrings = new ArrayList<>();
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        ArrayList<String[]> testArray = test.printColumns(testStrings);
        int columns = testArray.size();
        int col1 = testArray.get(0).length;
        int col2 = testArray.get(1).length;
        int col3 = testArray.get(2).length;

        assertEquals(3, columns, "printColumns() gives wrong number of columns");
        assertEquals(16, col1, "printColumns() fills columns wrong");
        assertEquals(16, col2, "printColumns() fills columns wrong");
        assertEquals(8, col3, "printColumns() fills columns wrong");
    }

    @Test
    void testSizeSixtyTwo()
    {
        ArrayList<String> testStrings = new ArrayList<>();
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        testStrings.add("1");
        ArrayList<String[]> testArray = test.printColumns(testStrings);
        int columns = testArray.size();
        int col1 = testArray.get(0).length;
        int col2 = testArray.get(1).length;
        int col3 = testArray.get(2).length;
        int col4 = testArray.get(3).length;

        assertEquals(4, columns, "printColumns() gives wrong number of columns");
        assertEquals(16, col1, "printColumns() fills columns wrong");
        assertEquals(16, col2, "printColumns() fills columns wrong");
        assertEquals(16, col3, "printColumns() fills columns wrong");
        assertEquals(14, col4, "printColumns() fills columns wrong");
    }

    @AfterEach
    void teardown()
    {

    }
}
