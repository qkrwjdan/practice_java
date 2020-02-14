import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

class SimpleBinWriteRead{
    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("/Users/macbookair/Desktop/java/simple.bin");

        try{
            fp = Files.createFile(fp);
        }
        catch(Exception e){

        }

        byte buf1[] = {0x13,0x14,0x15};

        for(byte b : buf1){
            System.out.print(b + "\t");
        }
        System.out.println();

        Files.write(fp,buf1,StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);

        byte buf2[] = Files.readAllBytes(fp);
        for (byte b : buf2) {
            System.out.print(b + "\t");
        }
        System.out.println();
    }
}