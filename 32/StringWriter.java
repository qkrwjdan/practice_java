import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class StringWriter{
    public static void main(String[] args) {
        String ks = "공부에 있어서 돈이 필요한건 아니지만 있으면 좋다.";
        String es = "Life is long if you know how to use it";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))){
            bw.write(ks,0,ks.length());
            bw.newLine();
            bw.write(es,0,es.length());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}