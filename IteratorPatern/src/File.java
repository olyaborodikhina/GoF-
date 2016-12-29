import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by omsk17 on 12/29/2016.
 */
public class File implements FileSystemItem {
    String name;
    List<FileSystemItem> items = new ArrayList<>();


    public String getName(){
        return name;
    }

    @Override
    public Iterator<FileSystemItem> iterator() {
        File that = this;
        return new Iterator<FileSystemItem>() {
            boolean hasNext = true;
            Iterator<FileSystemItem> iterator = items.iterator();
            Iterator<FileSystemItem> current = iterator.next().iterator();

            @Override
            public boolean hasNext() {
                return  current != null && current.hasNext();
            }

            @Override
            public FileSystemItem next() {

                if(!hasNext){
                    throw new NoSuchElementException();
                }
                hasNext = false;
                return that;
            }
        };
    }


}
