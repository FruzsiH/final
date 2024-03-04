package homework;

import java.util.Scanner;

public class FinalBmi {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a testsúlyát kilogrammban: ");
        double weight = scanner.nextDouble();
        System.out.print("Kérem, adja meg a magasságát méterben: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI érték: " + bmi);

        String category;
        if (bmi < 18.5) {
            category = "Alultáplált";
        } else if (bmi < 25.0) {
            category = "Normális";
        } else if (bmi < 30.0) {
            category = "Túlsúlyos";
        } else {
            category = "Elhízott";
        }

        System.out.println("BMI kategória: " + category);
    }
}
