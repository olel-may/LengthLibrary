import com.test.meter.Centimeter;
import com.test.meter.Meter;

/**
 * Created with IntelliJ IDEA.
 * User: lisa
 * Date: 6/12/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Meter meter = new Meter(98);
        System.out.println(meter);

        Centimeter centimeter = new Centimeter(5);
        System.out.println(centimeter);
    }
}
