import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

class StringWriterNewYear{
    public static void main(String[] args) {
        String ks = "공부에 있어서 돈이 꼭 필요한건 아니지만 있으면 졸라 편하다";
        String es = "Life is long if you know how to use it";

        Path fp = Paths.get("String.txt");

        try (BufferedWriter bw = Files.newBufferedWriter(fp)) {
            bw.write(ks,0,ks.length());
            bw.newLine();
            bw.write(es,0,es.length());
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = Files.newBufferedReader(fp)) {
            String str;
            while(true){
                str = br.readLine();
                if(str == null)
                    break;
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}