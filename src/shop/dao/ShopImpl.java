package shop.dao;

import shop.model.Computer;

public class ShopImpl implements Shop {

    public ShopImpl(int capacity) {
        computers = new Computer[capacity];
    }

    private Computer[] computers;
    private int size;

    @Override
    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputer(computer.getSerialNumber()) != null) {
            return false;
        }
        computers[size++] = computer;
        return true;
    }

    @Override
    public Computer removeComputer(long serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                Computer victim = computers[i];
                computers[i] = computers[--size];
                return victim;
            }
        }
        return null;
    }

    @Override
    public Computer findComputer(long serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double price() {
        return size;
    }

    @Override
    public double discount() {
        if (size == 0) {
            return 0;
        }
        double totalDiscount = 0;
        for (int i = 0; i < size; i++) {
            double originalPrice = computers[i].getOriginalPrice();
            double salePrice = computers[i].getSalePrice();
            double discount = ((originalPrice - salePrice) / originalPrice) * 100;
            totalDiscount += discount;
        }
        return totalDiscount / size;

    }

    @Override
    public void printComputer() {
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

    }

    @Override
    public Computer updateComputer(long serialNumber, String brand) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber() == serialNumber) {
                computers[i].setBrand(brand);
                return computers[i];
            }
        }
        return null;
    }
}