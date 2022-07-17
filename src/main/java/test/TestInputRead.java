package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.InputRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestInputRead {
    
    @Test
    @DisplayName("Verify InputRead is working.")
    void readInput() {
        try
        {
            assertEquals(Objects.requireNonNull(InputRead.readFile("src/main/java/inputTest.txt")).collect(Collectors.toList()), Files.readAllLines(Path.of("src/main/java/inputTest.txt")).stream().filter(i -> !i.isEmpty()).collect(Collectors.toList()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            fail();
        }
    }
    
    }