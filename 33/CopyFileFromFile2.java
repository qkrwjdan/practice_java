import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

class CopyFileFromFile{
    public static void main(String[] args) throws IOException{
        Path src = Paths.get("/Users/macbookair/desktop/java/33/CopyFileFromFile.java");
        Path dst = Paths.get("/Users/macbookair/desktop/java/CopyFileFromFile2.java");

        Files.copy(src, dst,StandardCopyOption.REPLACE_EXISTING);

        Path mdst = Paths.get("/Users/macbookair/desktop/java/33/CopyFileFromFile2.java");
        Files.move(dst,mdst,StandardCopyOption.REPLACE_EXISTING);
    }
}