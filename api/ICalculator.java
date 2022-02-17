/** 8 задание, ДЗ калькуляторы.
 * Напоминалка, интерфейс это то, что обязан уметь делать объект нашего класса.
 * Калькулятор должен уметь: складывать, вычитать, делить, умножать и т.д.
 *
 * В интерфейсах мы только объявляем "функционал". Реализацию не пишем.
 * Если что - вот здесь подробнее:
 * D:\Kursy IT\7-8 занятие записи с ютуб - ООП, классы, объекты, наследование и т.д\
 * Практика (инкапсуляция, наследование, полиморфизм, абстракция).
 *
 * И в интерефейсах не используется слово static.
 */

package hw3_Calculators.api;

public interface ICalculator {

  //public double plus(double a, double b); - слово public в начале можно не писать в интерфейсах.

    double plus(double a, double b);
    double minus(double a, double b);
    double div(double a, double b);
    double add(double a, double b);
    double pow(double a, int b);
    double abs(double a);
    double sqrt(double a);

}
