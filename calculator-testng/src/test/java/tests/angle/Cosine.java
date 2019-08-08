package tests.angle;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Cosine extends BaseTest {
    @Test
    public void checkCosine(){
        double result = calculator.cos(0);
        Assert.assertEquals(result,1);
    }
}
