/**
 * 9 задание ДЗ калькуляторы
 */

package hw3_Calculators.runners;

import hw3_Calculators.additional.CalculatorWithCounterAutoCompositeInterface;
import hw3_Calculators.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface calc;

        calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
      //calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());
      //calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());

        double add = calc.add(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println("Результат: " + result);
        System.out.println("Количество операций: " + calc.getCountOperation());

    }
}
