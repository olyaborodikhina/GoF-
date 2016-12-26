
import java.util.ArrayList;

/**
 * Created by omsk17 on 12/26/2016.
 */
public class Directory implements FileSystemItem {
    String name;
    ArrayList<FileSystemItem> files = new ArrayList<>();
}
