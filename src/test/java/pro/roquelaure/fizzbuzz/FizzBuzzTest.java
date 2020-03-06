package pro.roquelaure.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_print_empty_if_not_divisible_by_3_and_5() {
        int numberToTest = 2;

        String calcResult = FizzBuzz.calculate(numberToTest);
        assertEquals("", calcResult);
    }

    @Test
    public void should_print_fizzbuzz_if_divisible_by_3_and_5() {
        int numberToTest = 15;

        String calcResult = FizzBuzz.calculate(numberToTest);
        assertEquals("fizzbuzz", calcResult);
    }

    @Test
    public void should_print_fizz_if_a_multiple_of_3() {
        int numberToTest = 3;

        String calcResult = FizzBuzz.calculate(numberToTest);
        assertEquals("3", calcResult);
    }
}
