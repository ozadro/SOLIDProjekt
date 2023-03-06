package hr.algebra.Repository;

import hr.algebra.models.Employee;
import hr.algebra.models.Train;
import hr.algebra.models.TrainType;

import java.util.Random;

public class DataRepository implements Repository {



    @Override
    public void drive(Train train) {
        int status = train.getBatteryStatus();
        int gas = train.getGasQuantity();
        if (status <= 10){
            System.out.println("Your battery is near empty, please charge it!");
        }else{
            status -=10;
            train.setBatteryStatus(status);
            System.out.println("battery status after driving = "+ train.getBatteryStatus() + "%");

            if (gas <= 10){
                System.out.println("Your gas tank is near empty, please refill it!");
            } else {
                gas -= 10;
                train.setGasQuantity(gas);
                System.out.println("Gas tank after driving = " + train.getGasQuantity());
            }
        }
    }

    @Override
    public int trainSpace(Train train, TrainType trainType) {
        if (trainType.getSize().equals("Small")){
            train.setTrainSpace(8);
        }else if (trainType.getSize().equals("Large")){
            train.setTrainSpace(6);
        }
        return train.getTrainSpace();
    }

    @Override
    public int gasQuantity(Train train) {
        Random rand = new Random();
        train.setGasQuantity(rand.nextInt(100));
        return train.getGasQuantity();
    }

    @Override
    public void removeTrainSpace(Train train) {
        train.setTrainSpace(train.getTrainSpace() - 1);
    }

    @Override
    public void refill(Train train) {
        train.setBatteryStatus(100);
        System.out.println("Your battery is at 100%");
    }

    @Override
    public int buy(String carName,Train train) {
        if (train.getTrainType().getSize().equals("Small")) {
            switch (carName) {
                case "car" -> {
                    removeTrainSpace(train);
                    return 50;
                }
                case "van" -> {
                    removeTrainSpace(train);
                    return 80;
                }
                default -> {
                    return 0;
                }
            }
        } else if (train.getTrainType().getSize().equals("Large")) {
            switch (carName) {
                case "bus" -> {
                    removeTrainSpace(train);
                    return 50;
                }
                case "truck" -> {
                    removeTrainSpace(train);
                    return 80;
                }
                default -> {
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override
    public int ticketNumber(Train train) {
        return train.getTrainSpace();
    }

    @Override
    public void addDriver(Employee driver, Train train) {
        train.setDriver(driver);
        System.out.println(driver.toString() + " is now driving " + train.getName());
    }

    @Override
    public void removeDriver(Train train) {
        train.setDriver(null);
        System.out.println("Nobody is driving the train now!");
    }
}
