package tests.angle;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Tangent extends BaseTest {
    @Test
    public void checkTangent() {
        double result = calculator.tg(45);
        Assert.assertEquals(result, (double) 1);
    }
}
