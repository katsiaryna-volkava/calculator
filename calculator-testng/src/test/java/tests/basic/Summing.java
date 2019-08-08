package tests.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Summing extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of summing";

    @Test
    public void checkCorrectSumming() {
        var result = calculator.sum(2.4, 4.5);
        Assert.assertEquals(result, 6.9, ERROR_MESSAGE);
    }
}
