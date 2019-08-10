package data;
import com.epam.tat.module4.Calculator;
import org.testng.annotations.DataProvider;

public class DataForTests {

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




}
