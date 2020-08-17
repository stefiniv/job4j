package ru.job4j.loop;

/**
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Fitness {
    /**
     * @param ivan первый человек.
     * @param nik  второй человек.
     * @return количество месяцев за которые первый догонит второго.
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}