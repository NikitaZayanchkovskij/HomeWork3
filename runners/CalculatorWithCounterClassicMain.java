package hw3_Calculators.runners;

import hw3_Calculators.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double add = calc.add(15, 7);
        calc.incrementCountOperation();
        double div = calc.div(28, 5);
        calc.incrementCountOperation();
        double pow = calc.pow(div, 2);
        calc.incrementCountOperation();
        double plus = calc.plus(4.1, add);
        calc.incrementCountOperation();
        double result = calc.plus(plus, pow);
        calc.incrementCountOperation();

        System.out.println("Результат: " + result);
        System.out.println("Количество операций: " + calc.getCountOperation());

    }
}
