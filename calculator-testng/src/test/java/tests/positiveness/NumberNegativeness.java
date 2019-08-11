package tests.positiveness;

import data.operations.DataForPositivenessAndNegativeness;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NumberNegativeness extends BaseTest {
    @Test(dataProviderClass = DataForPositivenessAndNegativeness.class,
            dataProvider = "dataForCheckingWhetherTheNumberIsNegative")
    public void checkIfNumberIsNegative(long checkedValue, boolean expectedResult) {
        boolean actualResult = calculator.isNegative(checkedValue);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
