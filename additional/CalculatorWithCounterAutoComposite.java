/**
 * 7 задание ДЗ калькуляторы
 */

package hw3_Calculators.additional;

import hw3_Calculators.simple.CalculatorWithMathCopy;
import hw3_Calculators.simple.CalculatorWithMathExtends;
import hw3_Calculators.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long countOperation = 0;
    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;

    private void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc){//Конструктор
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc){//Конструктор
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc){//Конструктор
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    public double plus(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.plus(a, b);
        } else if(this.calc2 != null){
            return this.calc2.plus(a, b);
        } else {
            return this.calc3.plus(a, b);
        }
    }

    public double minus(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.minus(a, b);
        } else if(this.calc2 != null){
            return this.calc2.minus(a, b);
        } else {
            return this.calc3.minus(a, b);
        }
    }

    public double div(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.div(a, b);
        } else if(this.calc2 != null){
            return this.calc2.div(a, b);
        } else {
            return this.calc3.div(a, b);
        }
    }

    public double add(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.add(a, b);
        } else if(this.calc2 != null){
            return this.calc2.add(a, b);
        } else {
            return this.calc3.add(a, b);
        }
    }

    public double pow(double a, int b){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.pow(a, b);
        } else if(this.calc2 != null){
            return this.calc2.pow(a, b);
        } else {
            return this.calc3.pow(a, b);
        }
    }

    public double abs(double a){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.abs(a);
        } else if(this.calc2 != null){
            return this.calc2.abs(a);
        } else {
            return this.calc3.abs(a);
        }
    }

    public double sqrt(double a){
        incrementCountOperation();
        if(this.calc1 != null){
            return this.calc1.sqrt(a);
        } else if(this.calc2 != null){
            return this.calc2.sqrt(a);
        } else {
            return this.calc3.sqrt(a);
        }
    }

}
