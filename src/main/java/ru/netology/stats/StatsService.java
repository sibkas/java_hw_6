package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum; // вывод общей суммы
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales); // используем готовый метод

        return sum / sales.length; // вывод среднего за месяц
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int countMonthsAboveAverage(long[] sales) {
        long average =  averageSales(sales);

        int count = 0; // счётчик месяцев выше среднего
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsBelowAverage(long[] sales) {
        long average = averageSales(sales);

        int count = 0; // счётчик месяцев ниже среднего
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }


}
