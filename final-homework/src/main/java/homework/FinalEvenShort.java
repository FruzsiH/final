package homework;

public class FinalEvenShort {

    public static void main(String[] args) {
        System.out.println(" 1 és 10 közötti páros számok: ");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
