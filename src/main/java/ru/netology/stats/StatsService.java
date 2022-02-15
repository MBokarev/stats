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
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSales = sum / sales.length;
        return averageSales;
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
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSales = sum / sales.length;
        int numberMonthWithSalesBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                numberMonthWithSalesBelowAverage++;
            }
        }
        return numberMonthWithSalesBelowAverage;
    }

    public int aboveAverageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSales = sum / sales.length;
        int numberMonthWithSalesAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                numberMonthWithSalesAboveAverage++;
            }
        }
        return numberMonthWithSalesAboveAverage;
    }
}
