/**
 * Created by omsk17 on 12/27/2016.
 */
public abstract class Decorator implements Car{
    protected Car car;

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String printInfo(){
         return "Do nothing!";
    }
}
