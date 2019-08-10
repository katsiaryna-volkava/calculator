package tests.basic;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Summing extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of summing";

    @Test
    @Parameters({"firstInput", "secondInput", "expectedResult"})
    public void checkCorrectSumming(long firstInput, long secondInput, long expectedResult) {
        long result = calculator.sum(firstInput, secondInput);
        Assert.assertEquals(result, expectedResult, ERROR_MESSAGE);
    }
}
