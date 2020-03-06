package pro.roquelaure.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
    }

    public static String calculate(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return "";
        }
    }
}
