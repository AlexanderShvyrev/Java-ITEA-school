package Homework.OOP.Devices;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public EthernetAdapter setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public String getMac() {
        return mac;
    }

    public EthernetAdapter setMac(String mac) {
        this.mac = mac;
        return this;
    }

    @Override
    public String toString(){
        return super.toString() + ", speed=" + speed + ", mac=" + mac;
    }
}
