import java.nio.file.Path;
import java.nio.file.Paths;

class PathDemo{
    public static void main(String[] args) {
        Path p1 = Paths.get("/Users/macbookair/Desktop/java/33/PathDemo.java");
        Path p2 = p1.getRoot();
        Path p3 = p1.getParent();
        Path p4 = p1.getFileName();

        System.out.println("Absolute : " + p1);
        System.out.println("Root : " + p2);
        System.out.println("Parent : " + p3);
        System.out.println("File : " + p4);
    }
}