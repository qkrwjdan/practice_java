import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Write7ToFile{
    public static void main(String[] args) {
        try(OutputStream out = new FileOutputStream("data.dat")){
            int dat = in.read();
            System.out.println(dat);
        }catch(IoException e){
            e.printStackTrace();
        }
    }
}