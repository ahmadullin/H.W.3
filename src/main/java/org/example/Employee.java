package org.example;

// базовый абстрактный класс сотрудника
abstract class Employee implements Comparable<Employee> {
    protected String name; // имя сотрудника
    protected double monthlyPayment; // месячная оплата

    // конструктор
    public Employee(String name, double monthlyPayment) {
        this.name = name;
        this.monthlyPayment = monthlyPayment;
    }

    // абстрактный метод для расчета среднемесячной заработной платы
    public abstract double calculateAverageMonthlyPayment();

    // геттер для имени
    public String getName() {
        return name;
    }

    // геттер для месячной оплаты
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "Сотрудник: " + name + ", Месячная оплата: " + monthlyPayment;
    }

    // реализация метода compareTo для сравнения по имени
    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }
}