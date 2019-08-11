package tests.basic;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Summing extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of summing";

    @Test
    @Parameters({"firstInput", "secondInput", "expectedResult"})
    public void checkCorrectSumming(double firstInput, double secondInput, double expectedResult) {
        double result = calculator.sum(firstInput, secondInput);
        double roundedResult = roundToFourDigitsAfterPoint(result);
        Assert.assertEquals(roundedResult, expectedResult, ERROR_MESSAGE);
    }
}
