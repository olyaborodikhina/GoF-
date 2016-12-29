/**
 * Created by omsk17 on 12/29/2016.
 */
public class File implements FileSystem{
    String name;
    int size;

    @Override
    public void execute() {
        System.out.println("information!");
    }
}
