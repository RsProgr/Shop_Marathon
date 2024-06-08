package shop.model;

import java.util.Objects;

public class SmartPhone extends Computer{

    private String operationSystem;
    private boolean isSimCard;

    public SmartPhone(long serialNumber, String cpu, int ram, int ssd, String brand, String operationSystem, boolean isSimCard) {
        super(serialNumber, cpu, ram, ssd, brand);
        this.operationSystem = operationSystem;
        this.isSimCard = isSimCard;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public boolean isSimCard() {
        return isSimCard;
    }

    public void setSimCard(boolean simCard) {
        isSimCard = simCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone that)) return false;
        if (!super.equals(o)) return false;
        return isSimCard == that.isSimCard && Objects.equals(operationSystem, that.operationSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), operationSystem, isSimCard);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operationSystem='" + operationSystem + '\'' +
                ", isSimCard=" + isSimCard +
                '}';
    }
}
