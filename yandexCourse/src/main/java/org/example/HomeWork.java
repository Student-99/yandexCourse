package org.example;

public class HomeWork {
    /**
     * Функция получает на вход 4-х значное число
     * Функция должна вернуть число в обратном порядке
     * Например дано 1234, тогда необходимо вывести 4321
     * <p>
     * Необходимо написать реализацию, а так же написать
     * тесты (подумайте над кейсами)
     * <p>
     * 1000 -> 1 (это называется не значащие нули)
     */
    public static int reverse(int value) {
        checkingNumberOfCharacters(value, (byte) 4);
        String rev = new StringBuilder(String.valueOf(value)).reverse().toString();
        return Integer.parseInt(rev);
    }

    /**
     * Функция должна возвращать разность между
     * числом из двух первых цифр и числом из двух
     * последних. Вам дано число от 10 до 9999
     * Пример: 4412 -> 44 - 12 = 32
     * Написать полное решение, написать тесты,
     * подумать над кейсами
     */
    public static int difference(int value) {
        checkingNumberOfCharacters(value, (byte) 4);
        return value / 100 - value % 100;
    }

    public static void checkingNumberOfCharacters(int value, byte correctNumberOfNumbers) {
        int count = String.valueOf(value).length();
        if (count != correctNumberOfNumbers) {
            throw new RuntimeException(String.format("Введено значение \"%d\", состоящее не из 4-х символов.", value));
        }
    }

}
