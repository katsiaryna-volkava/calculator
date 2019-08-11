package data.operations;

import org.testng.annotations.DataProvider;

public class DataForPositivenessAndNegativeness {

    @DataProvider
    public Object[][] dataForCheckingWhetherTheNumberIsNegative() {
        return new Object[][]{
                {-5, true},
                {0, false},
                {10, false}
        };
    }

    @DataProvider
    public Object[][] dataForCheckingWhetherTheNumberIsPositive() {
        return new Object[][]{
                {-5, false},
                {0, false},
                {10, true}
        };
    }
}
