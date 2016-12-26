import java.util.HashSet;
import java.util.Set;

/**
 * Created by omsk17 on 12/26/2016.
 */
/*разработать дизайн Файловой системы, есть директории , а внихмогу быть другие директории или файлы*/
interface FileSys {
    String name = null;
    int size = 0;
    Set<Directional> directionals = new HashSet<>();
}
