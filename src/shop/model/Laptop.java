package shop.model;

import java.util.Objects;

public class Laptop extends Computer {

    private double displaySize;
    private double weight;
    private int batteryCapacity;

    public Laptop(long serialNumber, String cpu, int ram, int ssd, String brand, double originalPrice, double salePrice, double displaySize, double weight, int batteryCapacity) {
        super(serialNumber, cpu, ram, ssd, brand, originalPrice, salePrice);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(displaySize, laptop.displaySize) == 0 && Double.compare(weight, laptop.weight) == 0 && batteryCapacity == laptop.batteryCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), displaySize, weight, batteryCapacity);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}