/**
 * Created by omsk17 on 12/26/2016.
 */
public class File implements FileSystemItem{
    String name;
    int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public CopyOp copy(){
        return  new CopyOp() {
            @Override
            public void execute() {
                return new File(this.name, this.size);
            }
        };
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
