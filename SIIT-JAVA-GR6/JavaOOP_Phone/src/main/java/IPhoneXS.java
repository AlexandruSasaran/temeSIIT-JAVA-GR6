import org.apache.commons.lang3.ArrayUtils;
public class IPhoneXS extends IPhone{
    final private int Imei;

    public IPhoneXS(int batteryLife, String color, String material, int Imei) {
        super(batteryLife, color, material);
        this.Imei = Imei;
    }
}
