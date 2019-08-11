package tests.exponentation;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Exponentation extends BaseTest {
    @Test
    public void checkExponentation() {
        double result = calculator.pow(2, 5);
        Assert.assertEquals(result, (double) 32);
    }
}
