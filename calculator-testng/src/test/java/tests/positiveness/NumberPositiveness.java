package tests.positiveness;

import data.operations.DataForPositivenessAndNegativeness;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NumberPositiveness extends BaseTest {
    @Test(dataProvider = "dataForCheckingWhetherTheNumberIsPositive",
            dataProviderClass = DataForPositivenessAndNegativeness.class)
    public void checkIfNumberIsPositive(long checkedValue, boolean expectedResult) {
        boolean actualResult = calculator.isPositive(checkedValue);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
