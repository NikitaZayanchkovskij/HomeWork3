package hw3_Calculators.runners;

import hw3_Calculators.additional.CalculatorWithCounterAutoComposite;
import hw3_Calculators.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc;

        calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
      //calc = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
      //calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

        double add = calc.add(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println("Результат: " + result);
        System.out.println("Количество операций: " + calc.getCountOperation());

    }
}
