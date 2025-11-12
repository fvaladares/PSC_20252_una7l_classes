package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();

        System.out.println("Informe o valor da base: ");
        altura = input.nextDouble();
        Retangulo retangulo = new Retangulo(base, altura);


    }
}