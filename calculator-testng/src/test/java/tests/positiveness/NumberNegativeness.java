package tests.positiveness;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NumberNegativeness extends BaseTest {
    @Test
    public void checkIfNumberIsNegative() {
        boolean result = calculator.isNegative(-5);
        Assert.assertTrue(result);
    }
}
