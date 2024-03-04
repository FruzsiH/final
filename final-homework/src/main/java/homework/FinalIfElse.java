package homework;

public class FinalIfElse {

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 4;
        int result = 0;
        char symbol = '-';


        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '/') {
            result = num1 / num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        }
        System.out.println(result);
    }
}
