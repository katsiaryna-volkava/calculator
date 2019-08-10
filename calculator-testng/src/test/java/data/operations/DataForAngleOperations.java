package data.operations;

import org.testng.annotations.DataProvider;

public class DataForAngleOperations {

    @DataProvider
    public Object[][] valuesForSinusTest() {
        return new Object[][] {
                {0, 0},
                {10, 0.1736},
                {45, 0.7071},
                {60, 0.8660},
                {90, 1},
                {180, 0},
                {360, 0}
        };
    }

    @DataProvider
    public Object[][] valuesForCosineTest() {
        return new Object[][] {
                {0, 1},
                {10, 0.9848},
                {45, 0.7071},
                {60, 0.5},
                {90, 0},
                {180, -1},
                {360, 1}
        };
    }

    @DataProvider
    public Object[][] valuesForTangentTest() {
        return new Object[][] {
                {0, 0},
                {10, 0.1763},
                {45, 1},
                {60, 1.732},
                {90, },
                {180, 0},
                {360, 0}
        };
    }


    @DataProvider
    public Object[][] valuesForCotangentTest() {
        return new Object[][] {
                {0},
                {10},
                {45},
                {60},
                {90},
                {180},
                {360}
        };
    }
}
