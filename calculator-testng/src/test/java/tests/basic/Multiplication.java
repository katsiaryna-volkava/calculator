package tests.basic;

import data.operations.DataForBasicOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Multiplication extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of multiplication";

    @Test(dataProvider = "valuesForMultiplicationTest", dataProviderClass = DataForBasicOperations.class)
    public void checkCorrectMultiplication(double firstInput, double secondInput, double expectedResult) {
        double result = calculator.mult(firstInput, secondInput);
        double roundedResult = roundToFourDigitsAfterPoint(result);
        Assert.assertEquals(roundedResult, expectedResult);
    }
}
