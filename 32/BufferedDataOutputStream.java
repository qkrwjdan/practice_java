import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;

class BufferedDataOutputStream{
    public static void main(String[] args) {
        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")))){
            out.writeInt(379);
            out.writeDouble(3.14);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.dat")))){
            int num1 = in.readInt();
            double num2 = in.readDouble();

            System.out.println(num1);
            System.out.println(num2);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}