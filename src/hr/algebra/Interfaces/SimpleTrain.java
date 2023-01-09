package hr.algebra.Interfaces;

import hr.algebra.models.Employee;

public interface SimpleTrain {

     void drive();
     int trainSpace();
     int gasQuantity();

     void refill();

     int buy(String vehicleName);

     int ticketNumber();

     void addDriver(Employee driver);

     void removeDriver();

}
