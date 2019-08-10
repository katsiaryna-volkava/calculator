package tests.basic;

import data.DataForTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Multiplication extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of multiplication";

    @Test(dataProvider = "valuesForMultiplicationTest", dataProviderClass = DataForTests.class)
    public void checkCorrectMultiplication(double firstInput, double secondInput, double expectedResult) {
        double result = calculator.mult(firstInput, secondInput);
        Assert.assertEquals(roundDoubleValue(result), roundDoubleValue(expectedResult));
    }
}
