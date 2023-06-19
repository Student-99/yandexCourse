package tests;

import org.example.HomeWork;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests {
    @ParameterizedTest
    @CsvSource({
        "1234,4321",
        "9999,9999",
    })
    void testCheckReverse(int value, int expected) {
        int inverseNumber = HomeWork.reverse(value);
        Assertions.assertEquals(inverseNumber, expected, "Функция вернула число не в обратном порядке");
    }

    @ParameterizedTest
    @ValueSource(ints = {123,13,1,12345})
    void testError(Integer arg) {
        Throwable exception = Assertions.assertThrows(RuntimeException.class, () -> {
            HomeWork.checkingNumberOfCharacters(arg, (byte) 4);
        });
        Assertions.assertEquals("Введено значение \""+arg+"\", состоящее не из 4-х символов.", exception.getMessage());

    }

    @ParameterizedTest
    @CsvSource({
        "1234,-22",
        "4444,0",
        "9990,9"
    })
    void testCheckDifference(int value, int expected) {
        int exp = HomeWork.difference(value);
        Assertions.assertEquals(
            expected,
            exp,
            String.format("Разница между первыми 2-мя цифрами и последними посчитана неверно")
        );
    }
}
