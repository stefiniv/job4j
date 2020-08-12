package ru.job4j.loop;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Метод для подсчета сумы чётных чисел в диапазоне.
     *
     * @param start  первое число диапазона.
     * @param finish последние число диапазона.
     * @return суму чётных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            if ((start % 2) == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }
}