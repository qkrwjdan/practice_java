import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

class FileCopierVerNIO{
    public static void main(String[] args){
        Path src = Paths.get("/Users/macbookair/desktop/java/33/FileCopierVerNIO.java");
        Path dst = Paths.get("/Users/macbookair/desktop/java/33/Copy.java");

        ByteBuffer buf = ByteBuffer.allocate(1024);

        try (FileChannel ifc = FileChannel.open(src,StandardOpenOption.READ);FileChannel ofc = FileChannel.open(dst,StandardOpenOption.WRITE,StandardOpenOption.CREATE)) {
            int num;
            while(true){
                num = ifc.read(buf);
                if(num == -1)
                    break;
                
                buf.flip();
                ofc.write(buf);
                buf.clear();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}