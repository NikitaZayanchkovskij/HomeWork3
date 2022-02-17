package hw3_Calculators.runners;

import hw3_Calculators.additional.CalculatorWithCounterAutoSuper;
import hw3_Calculators.api.ICalculator;

public class CalculatorInterfaceTestMain {
    public static void main(String[] args) {
        ICalculator calc;

      //calc = new CalculatorWithMathCopy();
      //calc = new CalculatorWithOperator();
      //calc = new CalculatorWithMathExtends();
      //calc = new CalculatorWithCounterClassic();
        calc = new CalculatorWithCounterAutoSuper();

        double add = calc.add(15, 7);

        System.out.println("Результат: " + add);
        if(calc instanceof CalculatorWithCounterAutoSuper){
            CalculatorWithCounterAutoSuper calcWithCounter = (CalculatorWithCounterAutoSuper) calc;
            System.out.println("Количество операций: " + calcWithCounter.getCountOperation());
        }

        /**
         * instanceof позволяет спросить:
         * Объект, который лежит в переменной calc, создан из какого класса?
         * Связан ли он с каким-то конкретным классом, который нам нужен?
         * instanceof переводится как экземпляр.
         *
         * В данном случае мы попадём в if если объект, лежащий в нашей переменной
         * как-то связан с типом CalculatorWithCounterAutoSuper.
         * Если не связан - мы в if не попадём, и не увидим сообщение количество использований.
         */

    }
}
