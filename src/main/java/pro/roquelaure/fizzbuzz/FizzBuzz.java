package pro.roquelaure.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
    }

    public static String calculate(int num) {
        return num % 3 == 0 ? (num % 5 == 0 ? "fizzbuzz" : "fizz") : num % 5 == 0 ? "buzz" : "";
    }
}
