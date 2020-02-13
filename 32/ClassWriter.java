import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

class ClassWriter{
    public static void main(String[] args) {
        try(Writer out = new FileWriter("data.txt")){
            out.write('A');
            out.write('한');
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}