package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // создание массива из 10 сотрудников
        Employee[] employees = new Employee[10];
        employees[0] = new Freelancer("Иван", 150);
        employees[1] = new Worker("Петр", 5000);
        employees[2] = new Freelancer("Алексей", 200);
        employees[3] = new Worker("Ольга", 6000);
        employees[4] = new Freelancer("Мария", 180);
        employees[5] = new Worker("Андрей", 5500);
        employees[6] = new Freelancer("Сергей", 160);
        employees[7] = new Worker("Елена", 5800);
        employees[8] = new Freelancer("Николай", 170);
        employees[9] = new Worker("Анна", 5400);

        // сортировка массива по имени (используя интерфейс Comparable)
        Arrays.sort(employees);

        System.out.println("\nМассив сотрудников, отсортированный по имени:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // сортировка массива по заработной плате (используя интерфейс Comparator)
        Arrays.sort(employees, new PaymentComparator());

        System.out.println("\nМассив сотрудников, отсортированный по заработной плате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // реализация интерфейса Comparator для сравнения по заработной плате
    static class PaymentComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            if (emp1.calculateAverageMonthlyPayment() < emp2.calculateAverageMonthlyPayment()) {
                return -1;
            } else if (emp1.calculateAverageMonthlyPayment() > emp2.calculateAverageMonthlyPayment()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}