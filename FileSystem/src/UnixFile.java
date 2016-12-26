/**
 * Created by omsk17 on 12/26/2016.
 */
public class UnixFile implements FileSystem {

    File createFiles(String  name) {
        return new File(name, 0) {

        }
    }




}

