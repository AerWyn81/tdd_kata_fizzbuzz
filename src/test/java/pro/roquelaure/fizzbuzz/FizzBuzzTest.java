package pro.roquelaure.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void should_print_empty_if_not_divisible_by_3_and_5() {
        int numberToTest = 2;

        String calcResult = FizzBuzz.calculate(numberToTest);
        assertEquals("fizzbuzz", calcResult);
    }
}
