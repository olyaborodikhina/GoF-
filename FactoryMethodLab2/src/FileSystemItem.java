

/**
 * Created by omsk17 on 12/26/2016.
 */
public interface FileSystemItem {
    String name = null;
    //String name();
    int size = 0;
    CopyOp copy();
    public int size();
    public String getName();
}
