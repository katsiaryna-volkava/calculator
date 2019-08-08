package tests.exponentation;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RootExtraction extends BaseTest {
    @Test
    public void checkRootExtraction() {
        double result = calculator.sqrt(16);
        Assert.assertEquals(result, (double) 4);
    }
}
