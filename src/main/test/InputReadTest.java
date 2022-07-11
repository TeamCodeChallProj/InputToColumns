import junit.framework.TestCase;

public class InputReadTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testReadFile() {
        System.out.println(InputRead.readFile());
    }
}