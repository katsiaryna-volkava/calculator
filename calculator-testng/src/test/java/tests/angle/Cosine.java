package tests.angle;

import data.operations.DataForAngleOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Cosine extends BaseTest {
    @Test(dataProvider = "valuesForCosineTest", dataProviderClass = DataForAngleOperations.class)
    public void checkCosine(double angleValue, double expectedResult) {
        double actualResult = calculator.cos(angleValue);
        double roundedActualResult = roundToFourDigitsAfterPoint(actualResult);
        Assert.assertEquals(roundedActualResult, expectedResult);
    }
}
