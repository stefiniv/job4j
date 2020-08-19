package ru.job4j.loop;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PrimeNumber {
    /**
     * Метод для оприделения простых чисел.
     *
     * @param finish число для оприделения.
     * @return результат.
     */
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            for (int j = i; j % 2 == 0; ) {
                count++;
                break;
            }
        }
        return count;
    }
}