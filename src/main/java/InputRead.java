import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InputRead {
    public static Stream<String> readFile(){
        Stream<String> fileStream;

        try {
            fileStream = Files.lines(Paths.get(new File("").getAbsolutePath() + "/src/main/java/inputTest.txt"));
        } catch (IOException e) {
            System.out.println("no file found");
            return null;
        }

        return fileStream;
    }
}
