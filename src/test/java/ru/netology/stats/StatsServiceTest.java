package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long[] sales = { 15, 20, 18, 4, 34, 30 };

        long expectedSum = 121;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        long[] sales = { 15, 20, 18, 4, 34, 30 };

        long expectedAverage = 20;
        long actualAverage  = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage );
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = { 15, 20, 18, 4, 34, 30 };

        int expectedMaxSales = 5;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long[] sales = { 15, 20, 18, 4, 34, 30 };

        int expectedMinSales = 4;
        int actualMinSales  = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales );
    }

    @Test
    public void countMonthsAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = { 15, 20, 18, 4, 34, 30 };

        int expectedCountAbove = 2;
        int actualCountAbove  = service.countMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedCountAbove, actualCountAbove );
    }

    @Test
    public void countMonthsBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = { 15, 20, 18, 4, 34, 30 };

        int expectedCountBelow = 3;
        int actualCountBelow  = service.countMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedCountBelow, actualCountBelow );
    }

}
