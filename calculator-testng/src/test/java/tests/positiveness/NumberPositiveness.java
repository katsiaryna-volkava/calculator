package tests.positiveness;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NumberPositiveness extends BaseTest {
    @Test
    public void checkIfNumberIsPositive() {
        boolean result = calculator.isPositive(35);
        Assert.assertTrue(result);
    }
}
