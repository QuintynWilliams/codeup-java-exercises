import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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

//      RERun will remove and re enter the below List
        List <String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuff Oreos");
        try {
            Files.write(dataFile, groceryList);
            List <String> moreGrocery= Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(
                    dataFile,
                    moreGrocery,
//          Third arg for writing to open files
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> groceriesFileList = Files.readAllLines(dataFile);
            for (int i = 1; i <= groceriesFileList.size(); i+= 1) {
                System.out.printf("%d: %s %n", i, groceriesFileList.get(i-1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
