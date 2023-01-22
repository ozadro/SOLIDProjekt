package hr.algebra.UnitTest;

import hr.algebra.Repository.RepositoryFactory;
import hr.algebra.models.Employee;
import hr.algebra.models.Train;
import hr.algebra.models.TrainType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyUnitTest {
    @Test
    public void trainTesting() throws Exception {
        Train smallTrain = new Train("Mali Vlak", TrainType.SMALL);
        Train largeTrain = new Train("Veliki Vlak",TrainType.LARGE);
        assertEquals(smallTrain.getTrainType(), TrainType.SMALL);
        System.out.println("Test 1 trainTesting passed");
        assertEquals(largeTrain.getTrainType(), TrainType.LARGE);
        System.out.println("Test 2 trainTesting passed");
        assertEquals(smallTrain.getName(), "Mali Vlak");
        System.out.println("Test 3 trainTesting passed");
        assertEquals(largeTrain.getName(), "Veliki Vlak");
        System.out.println("Test 4 trainTesting passed");

    }
    @Test
    public void driverTesting() throws Exception {
        Train smallTrain = new Train("Mali Vlak", TrainType.SMALL);
        Employee pero = new Employee("Pero", "Peric", 0.11);
        RepositoryFactory.getRepository().addDriver(pero,smallTrain);
        assertEquals(smallTrain.getDriver(), pero);
        System.out.println("Test 1 driverTesting passed");

    }

}
