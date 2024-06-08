package shop.dao;

import shop.model.Computer;

public interface Shop {
    boolean addComputer(Computer computer);

    Computer removeComputer(long serialNumber);

    Computer findComputer(long serialNumber);

    int quantity();

    double price();

    double discount();

    void printComputer();

    Computer updateComputer(long serialNumber, String brand);


}
