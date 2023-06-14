package Homework.OOP.Devices;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public Monitor setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
        return this;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public Monitor setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
        return this;
    }

    @Override
    public String toString(){
        return super.toString() + ", X=" + resolutionX + ", Y=" + resolutionY;
    }
}
