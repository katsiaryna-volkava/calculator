package tests;

import com.epam.tat.module4.Calculator;
import org.apache.commons.math3.util.Precision;
import org.decimal4j.util.DoubleRounder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.IllegalFormatPrecisionException;

public class BaseTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown(){
        calculator = null;
    }

    public double roundDoubleValue(double valueToRound) {
        return DoubleRounder.round(valueToRound, 2);
    }

    public double roundToFourDigitsAfterPoint (double valueToRound) {
        return Precision.round(valueToRound, 4);
    }


}
