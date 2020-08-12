package ru.job4j.condition;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqMax {
    /**
     * @param first  Первое число.
     * @param second Второе число.
     * @param third  Третье число.
     * @param forth  Четвертое число.
     * @return Максимально число.
     */
    public static int max(int first, int second, int third, int forth) {
        int result = first;
        if (second > result) {
            result = second;
        }
        if (third > result) {
            result = third;
        }
        if (forth > result) {
            result = forth;
        }
        return result;
    }
}