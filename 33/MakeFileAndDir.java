import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class MakeFileAndDir{
    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("/Users/macbookair/Desktop/java/empty.txt");
        fp = Files.createFile(fp);

        Path dp1 = Paths.get("/Users/macbookair/Desktop/java/Empty");
        dp1 = Files.createDirectory(dp1);

        Path dp2 = Paths.get("/Users/macbookair/Desktop/java2/Empty");
        dp2 = Files.createDirectories(dp2);

        System.out.println(fp);
        System.out.println(dp1);
        System.out.println(dp2);
    }
}