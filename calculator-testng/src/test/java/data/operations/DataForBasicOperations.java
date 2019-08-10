package data.operations;

import org.testng.annotations.DataProvider;

public class DataForBasicOperations {

    @DataProvider(name = "valuesForSubtractionTest")
    public Object[][] valuesForSubtractionTest() {
        return new Object[][]{
                {15, 7, 8},
                {-10, -7, -3},
                {-10, 15, -25},
                {10, -6, 16},
                {2.2, 12, -9.8},
                {-4.56, -5.23, 0.67},
                {-14.78, 10, -24.78},
                {3.80, -4.35, 8.15},
        };
    }

    @DataProvider(name = "valuesForMultiplicationTest")
    public Object[][] valuesForMultiplicationTest() {
        return new Object[][]{
                {15, 7, 105},
                {-10, -7, 70},
                {-10, 15, -150},
                {10, -6, -60},
                {2.2, 12, 26.4},
                {-4.56, -5.23, -9.79},
                {-14.78, 10, -147.8},
                {3.80, -4.35, -0.55},
        };
    }


    @DataProvider(name = "valuesForDivisionTest")
    public Object[][] valuesForDivisionTest() {
        return new Object[][]{
                {15, 3, 5},
                {-20, -4, 5},
                {30, -10, -3},
                {-2, 4, -0.5},
                {2.8, 1.4, 2},
                {-4.5, 2, -2.25},
                {12.4, -3.2, -3.875},
                {-3.80, -3.8, 1},
                {14, 0, 23}
        };
    }


}
