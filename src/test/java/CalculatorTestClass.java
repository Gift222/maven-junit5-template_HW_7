import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestClass {
    @BeforeEach
    public void divisionOfTwoValues() {
        Calculator myCalculator = new Calculator();
        float actualValue = myCalculator.divisionOfTwoValues(4, 2);
        assertEquals(2, actualValue);

    }
    @BeforeEach
    public void multiplyTwoValues() {
        Calculator myCalculator = new Calculator();
        float actualValue = myCalculator.multiplyTwoValues(3.0, 3.0);
        assertEquals(9, actualValue);
    }

    @BeforeEach
    public void SquareOnePositiveValue() {
        Calculator myCalculator = new Calculator();
        double actualValue = Math.sqrt(9);
        assertEquals(3, actualValue);

    }

}