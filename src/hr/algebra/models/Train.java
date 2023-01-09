package hr.algebra.models;

import hr.algebra.Interfaces.SimpleTrain;

import java.util.Random;

public class Train implements SimpleTrain {


    private String vehicle;

    private int gasQuantity;

    private final String name;

    private int trainSpace;

    private int batteryStatus;

    private final TrainType trainType;

    private Employee driver;

    public Train(String trainName, TrainType trainType) {
        this.name = trainName;
        this.trainType = trainType;
        this.gasQuantity = gasQuantity();
        this.trainSpace = trainSpace();
        this.batteryStatus = 100;
    }

    @Override
    public void drive(){
        int status = getBatteryStatus();
        int gas = getGasQuantity();
        if (status <= 10){
            System.out.println("Your battery is near empty, please charge it!");
        }else{
            status -=10;
            this.batteryStatus = status;
            System.out.println("battery status after driving = "+ status + "%");

            if (gas <= 10){
                System.out.println("Your gas tank is near empty, please refill it!");
            } else {
                gas -= 10;
                this.gasQuantity = gas;
                System.out.println("Gas tank after driving = " + gas);
            }
        }


    }

    @Override
    public int trainSpace(){
        if (trainType.getSize().equals("Small")){
            trainSpace = 8;
        }else if (trainType.getSize().equals("Large")){
            trainSpace = 6;
        }
        return trainSpace;
    }

    @Override
    public int gasQuantity(){
        Random rand = new Random();
        gasQuantity =  rand.nextInt(100);
        return gasQuantity;
    }

    private void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    @Override
    public void refill() {
        setBatteryStatus(100);
        System.out.println("Your battery is at 100%");
    }

    @Override
    public int buy(String carName) {

        if (trainType.getSize().equals("Small")) {
            switch (carName) {
                case "car" -> {
                    removeTrainSpace(getTrainSpace());
                    return 50;
                }
                case "van" -> {
                    removeTrainSpace(getTrainSpace());
                    return 80;
                }
                default -> {
                    return 0;
                }
            }
        } else if (trainType.getSize().equals("Large")) {
            switch (carName) {
                case "bus" -> {
                    removeTrainSpace(getTrainSpace());
                    return 50;
                }
                case "truck" -> {
                    removeTrainSpace(getTrainSpace());
                    return 80;
                }
                default -> {
                    return 0;
                }
            }
        }
        return 0;
    }

    private void removeTrainSpace(int trainSpace) {
        this.trainSpace = trainSpace - 1;
    }

    @Override
    public int ticketNumber() {
        return trainSpace;
    }

    @Override
    public void addDriver(Employee driver) {
        this.driver = driver;
        System.out.println(driver.toString() + " is now driving " + this.name);

    }

    @Override
    public void removeDriver() {
        this.driver = null;
        System.out.println("Nobody is driving the train now!");
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
