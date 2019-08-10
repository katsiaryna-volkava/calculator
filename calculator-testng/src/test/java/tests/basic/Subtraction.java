package tests.basic;

import data.DataForTests;
import org.decimal4j.util.DoubleRounder;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Subtraction extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of subtraction";

    @Test(dataProvider = "valuesForSubtractionTest", dataProviderClass = DataForTests.class)
    public void checkCorrectSubtraction(double firstInput, double secondInput, double expectedResult) {
        double result = calculator.sub(firstInput, secondInput);
        Assert.assertEquals(roundDoubleValue(result), roundDoubleValue(expectedResult), ERROR_MESSAGE);
    }

    public double roundDoubleValue(double valueToRound) {
        return DoubleRounder.round(valueToRound, 2);
    }
}
