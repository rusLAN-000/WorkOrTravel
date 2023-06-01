package ru.netology.services;

public class WorkAndTravelServices {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (threshold > money) { // можем ли отдыхать?
                money = money + income - expenses;
            } else {
                count++;// увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            }
        }
        return count;
    }
}

