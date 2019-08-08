package tests.exponentation;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Exponentation extends BaseTest {
    @Test
    public void checkExponentation() {
        double result = calculator.pow(3, 4);
        Assert.assertEquals(result, (double) 81);
    }
}
