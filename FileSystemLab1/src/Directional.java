import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by omsk17 on 12/26/2016.
 */
public class Directional implements FileSys{
    String name;

    Set<FileSys> files = new HashSet<>();
    //Set<Directional> directionals = new HashSet<>();
    public Directional(String name, FileSys ... directionalContents){
        this.name =  name;
        directionalContents = ArrayList<FileSys>();
    }

}
