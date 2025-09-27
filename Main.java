

public class Main {
    public static void main(String[] args) {
        Charger laptopCharger = new TwoPinAdapter(new TwoPinPlug());
        laptopCharger.charge("Laptop");

        Charger phoneCharger = new UsbCAdapter(new UsbCPlug());
        phoneCharger.charge("Phone");
    }
}
