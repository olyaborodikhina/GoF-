/**
 * Created by omsk17 on 12/27/2016.
 */
public class ConcreteDecorator extends  Decorator {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String  printInfo() {
       System.out.println("No information!" + super.printInfo());
        return "";
    }
}
