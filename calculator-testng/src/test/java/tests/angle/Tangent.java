package tests.angle;

import data.operations.DataForAngleOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Tangent extends BaseTest {

    @Test(dataProvider = "valuesForTangentTest", dataProviderClass = DataForAngleOperations.class)
    public void checkTangent(double angleValue, double expectedResult) {
        double actualResult = calculator.tg(angleValue);
        double roundedActualResult = roundToFourDigitsAfterPoint(actualResult);
        Assert.assertEquals(roundedActualResult, expectedResult);
    }
}
