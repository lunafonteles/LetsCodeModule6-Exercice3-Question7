package com.exercise3.question7;

import java.util.Scanner;

public class Main {
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Person[] person = new Person[5];
    String name = "";
    int age;
    int bigger = 0;
    String biggerName = "";
    int smaller = 100;
    String smallerName = "";
    int average = 0;

    for (int i = 0; i<person.length; i++) {
        System.out.println("Informe o nome da pessoa " + (i+1));
        name = scanner.next();
        System.out.println("Informe a idade da pessoa " + (i+1));
        age = scanner.nextInt();
        average += age;
        person[i] = new Person(name, age);

        if(person[i].age > bigger) {
            bigger = person[i].age;
            biggerName = person[i].name;
        } else if (person[i].age < smaller) {
            smaller = person[i].age;
            smallerName = person[i].name;
        }
    }

    System.out.println("O mais novo é: " + smallerName);
    System.out.println("O mais velho é: " + biggerName);
    System.out.println("A média de idades é: " + average/ person.length);

}
}
