package tests.angle;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Sinus extends BaseTest {
    @Test
    public void checkSinus() {
        double result = calculator.sin(90);
        Assert.assertEquals(result, 1);
    }
}
