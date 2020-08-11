package ru.job4j.condition;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MultiMax {
    /**
     * Максимум из 3 чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return Самое большое число.
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        if (third > result ? true : false) {
            result = third;
        }
        return result;
    }
}