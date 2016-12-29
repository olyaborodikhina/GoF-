import java.util.ArrayList;

/**
 * Created by omsk17 on 12/29/2016.
 */
public class Launcher {

    ArrayList<FileSystem> commands = new ArrayList<>();

    public void addCommand(FileSystem fileSystem){
        this.commands.add(fileSystem);
        fileSystem.execute();
    }
}
