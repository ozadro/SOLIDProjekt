package hr.algebra;

import hr.algebra.Repository.RepositoryFactory;
import hr.algebra.UnitTest.MyUnitTest;
import hr.algebra.models.Employee;
import hr.algebra.models.Train;
import hr.algebra.models.TrainType;

public class Solid {

    public static void main(String[] args) throws Exception {

        double Ivoprovision;
        double Peroprovision;
        int tickets = 0;
        Train smallTrain = new Train("Mali Vlak",TrainType.SMALL);
        Train largeTrain = new Train("Veliki Vlak",TrainType.LARGE);

        Employee ivo = new Employee("Ivo", "Ivic", 0.10);
        Employee pero = new Employee("Pero", "Peric", 0.11);


        RepositoryFactory.getRepository().addDriver(pero,smallTrain);
        RepositoryFactory.getRepository().drive(smallTrain);


        tickets += RepositoryFactory.getRepository().buy("car", smallTrain);
        tickets += RepositoryFactory.getRepository().buy("van", smallTrain);

       Ivoprovision = tickets * ivo.getSalaryPercent();
       Peroprovision = tickets * pero.getSalaryPercent();

        System.out.println("All ticket provision is = " + tickets +" kn");
        System.out.println("Ivo's provision is = " + Ivoprovision +" kn");
        System.out.println("Pero's provision is = " + Peroprovision +" kn");


        //RepositoryFactory.getRepository().refill("train name");
        // sve metode se zovu putem repositoryfactorya
        // u primjeru je korišten samo mali vlak kako bi se prikazala funkcionalnost aplikacije, ali rade svi elementi.
        // testiranje vlakova
        MyUnitTest test = new MyUnitTest();
        test.trainTesting();
        test.driverTesting();


    }

}
