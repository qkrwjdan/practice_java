import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class StringReader{
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new FileReader("String.txt"))){
            String str;
            while(true){
                str = rd.readLine();
                if(str == null)
                    break;
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}