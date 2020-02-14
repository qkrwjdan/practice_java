import java.nio.file.Path;
import java.nio.file.Paths;

class CurrentDir{
    public static void main(String[] args) {
        Path cur = Paths.get("");
        String dir;

        if(cur.isAbsolute())
            dir = cur.toString();
        else
            dir = cur.toAbsolutePath().toString();

        System.out.println(dir);
    }
}