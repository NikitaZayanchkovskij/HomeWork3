package hw3_Calculators.simple;

import hw3_Calculators.api.ICalculator;

public class CalculatorWithOperator  implements ICalculator{

    public double plus(double a, double b){
        return a + b;
    }

    public double minus(double a, double b){
        return a - b;
    }

    public double div(double a, double b){
        return a / b;
    }

    public double add(double a, double b){
        return a * b;
    }

    public double pow(double a, int b){
        double result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }

    public double abs(double a){
        if(a < 0){
            return a * -1;
        } else {
            return a;
        }
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }

}
