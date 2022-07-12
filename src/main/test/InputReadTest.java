import junit.framework.TestCase;

import java.io.File;

public class InputReadTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testReadFile() {
        String filePath = (new File("").getAbsolutePath() + "/src/main/java/inputTest.txt");
        InputRead.readFile(filePath).forEach(System.out::println);
    }
}