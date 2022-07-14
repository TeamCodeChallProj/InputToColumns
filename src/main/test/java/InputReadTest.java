import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import java.io.File;


public class InputReadTest {

    @Test
    void setUp() throws Exception {
        super.setUp();
    }

    @Test
    void testReadFile() {
        String filePath = (new File("").getAbsolutePath() + "/src/main/java/inputTest.txt");
        InputRead.readFile(filePath).forEach(System.out::println);
    }
}