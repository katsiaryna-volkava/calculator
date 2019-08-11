package tests;

import com.epam.tat.module4.Calculator;
import jdk.swing.interop.SwingInterOpUtils;

public class Runner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(3,6));
        System.out.println(calculator.sum(3.4, 3.26));
        System.out.println(calculator.sub(5.6, -4.3));
        System.out.println(calculator.sub(5, -4));
        System.out.println(calculator.div(12,2));
        System.out.println(calculator.div(12,0));
        System.out.println(calculator.div(2.4, 0.0));
        System.out.println(calculator.mult(4,7));
        System.out.println(calculator.mult(4.5, 1.4));
        System.out.println(calculator.pow(2.2, 2));
        System.out.println(calculator.sqrt(-4));
        System.out.println(calculator.isPositive(4));
        System.out.println(calculator.isPositive(0));
        System.out.println(calculator.isPositive(-5));
        System.out.println(calculator.isNegative(-5));
        System.out.println(calculator.isNegative(0));
        System.out.println(calculator.isNegative(5));

        System.out.println(Math.tanh(30));
        System.out.println(calculator.tg(30));

    }
}
