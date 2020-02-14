import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

class SimpleTxtWriteRead{
    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("/Users/macbookair/Desktop/java");
        String st1 = "One Simple String";
        String st2 = "Two Simple String";

        List<String> ls = Arrays.asList(st1,st2);

        Files.write(fp,ls);
        List<String> ls2 = Files.readAllLines(fp);
        System.out.println(ls2);
    }
}