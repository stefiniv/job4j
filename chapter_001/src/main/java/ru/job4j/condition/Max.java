package ru.job4j.condition;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Максимум из 2 чисел.
     *
     * @param left  1 число.
     * @param right 2 число.
     * @return самое большое число.
     */
    public int max(int left, int right) {
        int result = (left > right) ? left : right;
        return result;
    }
}