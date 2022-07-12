import junit.framework.TestCase;

public class InputReadTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testReadFile() {
        InputRead.readFile().forEach(System.out::println);
    }
}