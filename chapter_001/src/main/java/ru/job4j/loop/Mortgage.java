package ru.job4j.loop;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Mortgage {
    /**
     * Метод для расчета ипотеки.
     *
     * @param amount  сума ипотеки.
     * @param monthly количество месяцев.
     * @param percent проценты.
     * @return количиство лет для расчета по ипотеке.
     */
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int sum = 0;
        while (sum < amount) {
            amount += amount * percent / 100;
            sum += monthly * 12;
            year++;
        }
        return year;
    }
}