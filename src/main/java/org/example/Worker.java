package org.example;

// класс работника с фиксированной оплатой
class Worker extends Employee {
    // конструктор
    public Worker(String name, double monthlyPayment) {
        super(name, monthlyPayment);
    }

    // реализация расчета среднемесячной заработной платы для работника с фиксированной оплатой
    @Override
    public double calculateAverageMonthlyPayment() {
        return monthlyPayment;
    }
}
