
public class UsbCAdapter implements Charger {
    private UsbCPlug plug;

    public UsbCAdapter(UsbCPlug plug) {
        this.plug = plug;
    }

    @Override
    public void charge(String deviceName) {
        plug.provideUsbCPower(deviceName);
    }
}
