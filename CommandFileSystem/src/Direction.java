import javax.activation.CommandObject;

/**
 * Created by omsk17 on 12/29/2016.
 */
public class Direction implements FileSystem{
    String name;
    String size;

    @Override
    public void execute() {
        System.out.println("information!");
    }
}
