/**
 * 11 задание ДЗ калькуляторы
 * Тупо дописали implements ICalculator )))
 */

package hw3_Calculators.additional;

import hw3_Calculators.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator{
    private long countOperation = 0;
    private final ICalculator calc;

    private void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator calc){//Конструктор
        this.calc = calc;
    }

    public double plus(double a, double b){
        incrementCountOperation();
        return this.calc.plus(a, b);
    }

    public double minus(double a, double b){
        incrementCountOperation();
        return this.calc.minus(a, b);
    }

    public double div(double a, double b){
        incrementCountOperation();
        return this.calc.div(a, b);
    }

    public double add(double a, double b){
        incrementCountOperation();
        return this.calc.add(a, b);
    }

    public double pow(double a, int b){
        incrementCountOperation();
        return this.calc.pow(a, b);
    }

    public double abs(double a){
        incrementCountOperation();
        return this.calc.abs(a);
    }

    public double sqrt(double a){
        incrementCountOperation();
        return this.calc.sqrt(a);
    }

}
