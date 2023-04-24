import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {

    public static void main(String[] args) {

//    JAVA
//      no slash = root of project
//      ./ = current folder
//      ../ = back one folder (from current)
//    TERMINAL
//      cd = current directory
//      cd.. = back one from current directory

        String directory = "data";
        String filename = "groceries.txt";

//      v-- Two Sep. Classes --v    provides methods IOT file manipulate
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

//      EXCEPTION Handling
//      Check to see if directory exists
        if (Files.notExists(dataDirectory)) {
            try {
//              HighlyLikely to run with an exception
//          .˙. RUN TRY CATCH
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Files.notExists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//      Files created this way will not be automatically tracked by GIT

//
        List <String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuff Oreos");
        Files.write(dataFile, groceryList);
    }

}
