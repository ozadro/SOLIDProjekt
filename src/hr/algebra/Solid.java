package hr.algebra;

import hr.algebra.models.Employee;
import hr.algebra.models.Train;
import hr.algebra.models.TrainType;

public class Solid {

    public static void main(String[] args) {

        double Ivoprovision;
        double Peroprovision;
        int tickets = 0;
        Train smallTrain = new Train("Mali Vlak",TrainType.SMALL);
        Train largeTrain = new Train("Veliki Vlak",TrainType.LARGE);

        Employee ivo = new Employee("Ivo", "Ivic", 0.10);
        Employee pero = new Employee("Pero", "Peric", 0.11);

        smallTrain.addDriver(pero);
        System.out.println(smallTrain);
        smallTrain.drive();
        tickets += smallTrain.buy("car");
        tickets += smallTrain.buy("van");
        Ivoprovision = tickets * ivo.getSalaryPercent();
        Peroprovision = tickets * pero.getSalaryPercent();

        System.out.println("All ticket provision is = " + tickets +" kn");
        System.out.println("Ivo's provision is = " + Ivoprovision +" kn");
        System.out.println("Pero's provision is = " + Peroprovision +" kn");

        //to refill train if its empty - smallTrain.refill();



    }

}
