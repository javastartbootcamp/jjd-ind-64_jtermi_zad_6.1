package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        boolean isInRange = false;
        boolean isDevidedByThree = false;
        int var;

        while (!isInRange || !isDevidedByThree) {
            System.out.println("Podaj liczbę:");
            var = scanner.nextInt();
            isInRange = logic.checkRange(var);
            if (isInRange) {
                isDevidedByThree = logic.checkDivisionByThree(var);
            }
        }
        System.out.println("Podana liczba jest poprawna");
    }
}
