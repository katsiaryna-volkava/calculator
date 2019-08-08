package tests.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Division extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of subtraction";
    //  private String ERROR_DIVISION_BY_ZERO = "Division by zero is prohibited";

    @Test
    public void checkCorrectDivision() {
        var result = calculator.div(6, 3);
        Assert.assertEquals(result, 2, ERROR_MESSAGE);
    }
}
