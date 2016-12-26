/**
 * Created by omsk17 on 12/26/2016.
 */
abstract class File implements FileSystemItem {
    String name;
    int size;

    File(String name, int size) {
        this.name = name;

    }
}
