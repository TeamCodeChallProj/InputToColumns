import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertThisTest {

    static ConvertThis c;

    @BeforeAll
    static void setUp() {
        c = new ConvertThis();
    }

    @Test
    void numberToWord() {

        assertEquals("five", c.numberToWord(5));
        assertEquals("sixteen", c.numberToWord(16));
        assertEquals("thirty one", c.numberToWord(31));
        assertEquals("forty", c.numberToWord(40));

    }

    @Test
    void wordToNumber() {

        assertEquals(5, c.wordToNumber("five"));
        assertEquals(16, c.wordToNumber("sixteen"));
        assertEquals(31, c.wordToNumber("thirty one"));
        assertEquals(40, c.wordToNumber("forty"));

    }
}