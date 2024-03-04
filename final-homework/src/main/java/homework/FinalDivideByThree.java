package homework;

public class FinalDivideByThree {

    public static void main(String[] args) {

        System.out.println("A hárommal osztható számok az -100 és 100 között:");
        for (int i = -100; i <= 100; i++) {
            if (i % 3 == 0 && i != 0) { // 0 nem osztható hárommal
                System.out.print(i + " ");
            }
        }
    }
}
