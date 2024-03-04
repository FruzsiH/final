package homework;

import java.util.Scanner;

public class FinalIrregularHalfPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Piramis magassága: ");
        int height = scanner.nextInt();
        System.out.print("Piramis szélessége: ");
        int width = scanner.nextInt();
        System.out.print("Szimbóluma: ");
        String symbol = scanner.next();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i <= width - j) {
                    System.out.print("");
                } else {
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
    }
}
