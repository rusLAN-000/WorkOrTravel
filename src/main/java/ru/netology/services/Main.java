package ru.netology.services;


public class Main {
    public static void main(String[] args) {
        WorkAndTravelServices services = new WorkAndTravelServices();
        System.out.println(services.calculate(100_000, 60_000, 150_000));
    }
}