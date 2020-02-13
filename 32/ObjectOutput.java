import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class ObjectOutput{
    public static void main(String[] args) {
        SandBox s1 = new SandBox("Robot");
        SandBox s2 = new SandBox("Strawberry");


        try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin"))){
            oo.writeObject(s1);
            oo.writeObject(s2);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream io = new ObjectInputStream(new FileInputStream("Object.bin"))){
            SandBox box1 = (SandBox)io.readObject();
            System.out.println(box1.getSandBox());
            SandBox box2 = (SandBox)io.readObject();
            System.out.println(box2.getSandBox());
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

class SandBox{
    String s;
    public SandBox(String s) {this.s = s;}
    public String getSandBox(){return this.s;}
}