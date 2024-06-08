import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestClass<multiplyTwoValues> {
@Test
        public void divisionOfTwoValues () {
            Calculator mycalculator = new Calculator();
            float actualValue = mycalculator.divisionOfTwoValues(4, 2);
            assertEquals(2, actualValue);
        }

        @Test
        public void multiplyTwoValues () {
            Calculator mycalculator = new Calculator();
            float actualValue = mycalculator.multiplyTwoValues(3.0F, 3.0F);
            assertEquals(9, actualValue);
        }

        @Test

        public void SquareOnePositiveValue () {
            Calculator mycalculator = new Calculator();
            double actualValue = Math.sqrt(9);
            assertEquals(3, actualValue);
        }
    }