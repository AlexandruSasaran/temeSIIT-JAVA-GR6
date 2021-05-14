import org.apache.commons.lang3.ArrayUtils;
public class IPhone10 extends IPhone{
    final private int Imei;

    public IPhone10(int batteryLife, String color, String material, int Imei) {
        super(batteryLife, color, material);
        this.Imei = Imei;
    }
}
