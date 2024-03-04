package homework;

public class FinalIfElseMethods {

    public static void main(String args[]) {
        int numA = 4;
        int numB = 8;
        char resultRes = '*';

        int result = calc(numA, numB, resultRes);

        System.out.println(result);
    }

    public static int calc(int numA, int numB, char symbol) {
        int result = 0;

        if (symbol == '+') {
            result = sum(numA, numB);
        } else if (symbol == '-') {
            result = sub(numA, numB);
        } else if (symbol == '/') {
            result = divide(numA, numB);
        } else if (symbol == '*') {
            result = multiply(numA, numB);
        }

        return result;
    }

    public static int sum(int numA, int numB) {
        return numA + numB;
    }

    public static int sub(int numA, int numB) {
        return numA - numB;
    }

    public static int divide(int numA, int numB) {
        return numA / numB;
    }

    public static int multiply(int numA, int numB) {
        return numA * numB;
    }
}
