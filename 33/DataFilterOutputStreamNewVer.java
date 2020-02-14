import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

class DataFilterOutputStreamNewVer{
    public static void main(String[] args) {
        Path fp = Paths.get("data.dat");
        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(fp))) {
            out.writeInt(370);
            out.writeDouble(3.141592);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream in = new DataInputStream(Files.newInputStream(fp))) {
            int num1 = in.readInt();
            double num2 = in.readDouble();

            System.out.println(num1);
            System.out.println(num2);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}