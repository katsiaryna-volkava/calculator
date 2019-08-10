package tests.angle;

import data.operations.DataForAngleOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Cotangent extends BaseTest {

    @Test(dataProvider = "valuesForCotangentTest", dataProviderClass = DataForAngleOperations.class)
    public void checkCotangent(double angleValue, double expectedResult) {
        double actualResult = calculator.ctg(angleValue);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
