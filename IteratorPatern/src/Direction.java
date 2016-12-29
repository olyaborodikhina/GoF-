import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by omsk17 on 12/29/2016.
 */
public class Direction implements FileSystemItem {
    String name;
    int size;

    List<FileSystemItem> files = new ArrayList<>();

    @Override
    public Iterator<FileSystemItem> iterator() {
        Direction that = this;
        return new Iterator<FileSystemItem>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public FileSystemItem next(){
                return that;
            }
        }
    }
}
