package tests.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Summing extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of summing";

    @Test
    public void checkCorrectSumming() {
        long result = calculator.sum(1, 2);
        Assert.assertEquals(result, 3, ERROR_MESSAGE);
    }
}
