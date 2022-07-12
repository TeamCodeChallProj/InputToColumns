import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InputRead {
    public static Stream<String> readFile(String filePath){
        Stream<String> fileStream;
        //filePath = (new File("").getAbsolutePath() + "/src/main/java/inputTest.txt");

        try {
            fileStream = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("File not found");
            return null;
        }

        return fileStream;
    }
}
