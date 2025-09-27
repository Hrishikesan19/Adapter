

public class TwoPinAdapter implements Charger {
    private TwoPinPlug plug;

    public TwoPinAdapter(TwoPinPlug plug) {
        this.plug = plug;
    }

    @Override
    public void charge(String deviceName) {
        plug.supplyPower(deviceName);
    }
}
