package tests.angle;

import data.operations.DataForAngleOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Sinus extends BaseTest {
    @Test(dataProvider = "valuesForSinusTest", dataProviderClass = DataForAngleOperations.class)
    public void checkSinus(double angleValue, double expectedResult) {
        double actualResult = calculator.sin(angleValue);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
