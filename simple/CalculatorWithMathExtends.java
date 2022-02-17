package hw3_Calculators.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    /**
     * Здесь можно не писать implements ICalculator т.к. реализация интерфейса
     * есть у родительского класса.
     */

    @Override
    public double pow(double a, int b){
        return Math.pow(a, b);
    }

    @Override
    public double abs(double a){
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a){
        return Math.sqrt(a);
    }
    
}
