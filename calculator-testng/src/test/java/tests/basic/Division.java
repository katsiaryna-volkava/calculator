package tests.basic;

import data.operations.DataForBasicOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Division extends BaseTest {
    private String ERROR_MESSAGE = "Invalid result of subtraction";
    //  private String ERROR_DIVISION_BY_ZERO = "Division by zero is prohibited";

    @Test (dataProvider = "valuesForDivisionTest", dataProviderClass = DataForBasicOperations.class)
    public void checkCorrectDivision(double firstInput, double secondInput, double expectedResult) {
        double result = calculator.div(firstInput, secondInput);
        Assert.assertEquals(roundDoubleValue(result), roundDoubleValue(expectedResult));
    }
}
