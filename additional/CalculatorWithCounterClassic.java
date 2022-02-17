package hw3_Calculators.additional;

import hw3_Calculators.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation = 0;

    public void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

}
