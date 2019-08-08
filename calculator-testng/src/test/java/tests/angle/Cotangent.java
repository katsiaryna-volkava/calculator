package tests.angle;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Cotangent extends BaseTest {
    @Test
    public void checkCotangent() {
        double result = calculator.ctg(1);
        Assert.assertEquals(result, 1);
    }

}
