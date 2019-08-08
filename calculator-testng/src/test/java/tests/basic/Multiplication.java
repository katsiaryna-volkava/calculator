package tests.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Multiplication extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of multiplication";

    @Test
    public void checkCorrectMultiplication() {
        var result = calculator.mult(1.35, 2);
        Assert.assertEquals(result, 0, ERROR_MESSAGE);
    }
}
