import java.util.ArrayList;
import java.util.List;

/**
 * Created by omsk17 on 12/26/2016.
 */
abstract class Directory implements FileSystemItem {
    String name;
    List<FileSystemItem> files = new ArrayList<>();
}
