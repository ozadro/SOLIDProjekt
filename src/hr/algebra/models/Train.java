package hr.algebra.models;

import hr.algebra.Repository.RepositoryFactory;

public class Train{
    private int gasQuantity;

    private final String name;

    private int trainSpace;

    private int batteryStatus;

    private final TrainType trainType;

    private Employee driver;

    public Train(String trainName, TrainType trainType) throws Exception {
        this.name = trainName;
        this.trainType = trainType;
        this.gasQuantity = RepositoryFactory.getRepository().gasQuantity(this);
        this.trainSpace = RepositoryFactory.getRepository().trainSpace(this, trainType);
        this.batteryStatus = 100;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public void setGasQuantity(int gasQuantity) {
        this.gasQuantity = gasQuantity;
    }

    public void setTrainSpace(int trainSpace) {
        this.trainSpace = trainSpace;
    }

    public void setDriver(Employee driver) {
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public Employee getDriver() {
        return driver;
    }

    public int getBatteryStatus(){
        return batteryStatus;

    }

    public int getGasQuantity() {
        return gasQuantity;
    }

    public int getTrainSpace() {
        return trainSpace;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    @Override
    public String toString() {
        return name+ " ( " +
                "gasQuantity = " + gasQuantity +
                ", trainSpace = " + trainSpace +
                ", batteryStatus = " + batteryStatus + "% " +
                ", trainType=" + trainType + " )"
                ;
    }
}
