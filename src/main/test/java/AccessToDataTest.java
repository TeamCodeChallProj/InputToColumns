import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AccessToDataTest {

    @Test
    void inputFileExists() {
        assertTrue(AccessToData.inputFileExists());
    }


    @Test
    void createInputFile() {
        assertTrue(AccessToData.createInputFile());
    }

    @Test
    void readInputFile() {
        ArrayList<String> input = new ArrayList<>(AccessToData.readInputFile());
        assertTrue(input.size() != 0);
    }

    @Test
    void fillInputFile() throws FileNotFoundException {
        assertTrue(AccessToData.fillInputFile());
    }
}