package homework;

import java.util.Scanner;

public class FinalEvenNumbers {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Kérem, adjon meg egy egész számot [-100;100] intervallumból: ");
            int num1 = scanner.nextInt();
            System.out.print("Kérem, adjon meg egy másik egész számot [-100;100] intervallumból: ");
            int num2 = scanner.nextInt();

            int min = Math.min(num1, num2);
            int max = Math.max(num1, num2);

            System.out.println("A páros számok " + min + " és " + max + " között:");
            for (int i = min; i <= max; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

