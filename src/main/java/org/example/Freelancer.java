package org.example;

// класс "повременщика"
class Freelancer extends Employee {
    private double hourlyRate; // почасовая ставка

    // конструктор
    public Freelancer(String name, double hourlyRate) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
    }

    // реализация расчета среднемесячной заработной платы для "повременщика"
    @Override
    public double calculateAverageMonthlyPayment() {
        return 20.8 * 8 * hourlyRate;
    }

    // геттер для почасовой ставки
    public double getHourlyRate() {
        return hourlyRate;
    }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "Повременщик: " + name + ", Почасовая ставка: " + hourlyRate + ", Месячная оплата: " + calculateAverageMonthlyPayment();
    }
}