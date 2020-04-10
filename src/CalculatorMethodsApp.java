// HomeWork from https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/functional/CALCULATOR.STATIC.ru.md


public class CalculatorMethodsApp {


    public static void main(String[] args) {

        printDivider();
        printResult(add(0, 1));
        printResult(sub(5, 2));
        printResult(mul(2, 2));
        printResult(div(10, 2));
        printResult(pow(2, 3));
        printResult(add(0, 1)+pow(2, 3)*sub(5, 2)/mul(2, 2)- div(10, 2));
        printDivider();
    }


    static void printResult(int result) {
        System.out.printf("result: %08d\n", result);
    }

    static void printDivider() {
        System.out.println("################");

    }

    static int add(int a, int b) {
        int r = a + b;
        return r;
    }


    static int sub(int a, int b) {
        int r = a - b;
        return r;
    }

    static int mul(int a, int b) {
        int r = a * b;
        return r;
    }

    static int div(int a, int b) {
        int r = a / b;
        return r;
    }

    static int pow(int v, int e) {
        int p = 1;
        for (; e > 0; e--) {
            p *= v;

        }
        return p;
    }
}




