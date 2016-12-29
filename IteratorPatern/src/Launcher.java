import java.util.ArrayList;
import java.util.List;

/**
 * Created by omsk17 on 12/29/2016.
 */
public class Launcher {

    static List <FileSystemItem> files = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File();
        file.name = "file1";
        files.add(file);

        Direction direction = new Direction();
        direction.name = "direction1";
        files.add(direction);


        for (FileSystemItem iterator:files
             ) {
            System.out.println(files.iterator().next().getName());
        }
    }
}
