package homework;

import java.util.Scanner;

public class FinalEvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy számot:");
        int number = scanner.nextInt();
        boolean again = true;


        if (number % 2 == 0 && number != 0) {
            System.out.println("A szám páros, adj meg még egy számot!");
            again = true;
        } else {
            System.out.println(" A szám páratlan, a játéknak vége!");
            again = false;
        }
    }
}