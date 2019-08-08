package tests.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Subtraction extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of subtraction";

    @Test
    public void checkCorrectSubtraction() {
        long result = calculator.sub(100, 35);
        Assert.assertEquals(result, 65, ERROR_MESSAGE);
    }
}
