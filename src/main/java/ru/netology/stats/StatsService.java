package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesAmountInMounth(int[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int numberMonthWithSalesBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSalesAmountInMounth(sales)) {
                numberMonthWithSalesBelowAverage++;
            }
        }
        return numberMonthWithSalesBelowAverage;
    }

    public int aboveAverageSales(int[] sales) {
        int numberMonthWithSalesAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSalesAmountInMounth(sales)) {
                numberMonthWithSalesAboveAverage++;
            }
        }
        return numberMonthWithSalesAboveAverage;
    }
}
