import java.util.Iterator;

/**
 * Created by omsk17 on 12/29/2016.
 */
public class File implements FileSystemItem {
    String name;

    @Override
    public Iterator<FileSystemItem> iterator() {
        File that = this;
        return new Iterator<FileSystemItem>() {
            boolean hasNext = true;
            @Override
            public boolean hasNext() {
                return hasNext;
            }

            @Override
            public FileSystemItem next() {
                hasNext = false;
                return that;
            }
        };
    }


}
