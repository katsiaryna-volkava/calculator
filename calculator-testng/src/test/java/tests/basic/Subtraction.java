package tests.basic;

import data.operations.DataForBasicOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Subtraction extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of subtraction";

    @Test(dataProvider = "valuesForSubtractionTest", dataProviderClass = DataForBasicOperations.class)
    public void checkCorrectSubtraction(double firstInput, double secondInput, double expectedResult) {
        double result = calculator.sub(firstInput, secondInput);
        Assert.assertEquals(roundDoubleValue(result), roundDoubleValue(expectedResult), ERROR_MESSAGE);
    }
}
