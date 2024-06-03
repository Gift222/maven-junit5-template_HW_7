import org.junit.jupiter.api.Test;

public class Calculator {

    // method for floating point division
    public float divisionOfTwoValues(float firstInputValue, float secondInputValue) {
        float result = firstInputValue / secondInputValue;
        return result;
    }
    // method for multiplication of floating point numbers
    public float multiplyTwoValues(float firstInputValue, float secondInputValue) {
        float result = firstInputValue * secondInputValue;
        return result;
    }
    //method for squaring one number
    public double squaringOneValue (double firstInputValue){
        double result = Math.sqrt( firstInputValue);
        return result;
    }

    }

