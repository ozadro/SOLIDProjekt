package hr.algebra.Repository;

import hr.algebra.models.Employee;
import hr.algebra.models.Train;
import hr.algebra.models.TrainType;

public interface Repository {
    void drive(Train train);
    int trainSpace(Train train, TrainType trainType);
    int gasQuantity(Train train);

    void removeTrainSpace(Train train);
    void refill(Train train);

    int buy(String carName, Train train);

    int ticketNumber(Train train);

    void addDriver(Employee driver, Train train);

    void removeDriver(Train train);
}
