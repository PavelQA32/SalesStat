package ru.netology.stats;

public class StatsService {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        int avg = calculateSum(sales) / sales.length;
        return avg;
    }

    public int calculateMaxSaleMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }


    public int calculateMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int calculateBottomAvgMonths(int[] sales) {
        int bottomAvgMonths = 0;
        for (int sale : sales) {
            if (sale < calculateAvg(sales)) {
                bottomAvgMonths += 1;
            }
        }
        return bottomAvgMonths;
    }

    public int calculateOverAvgMonths(int[] sales) {
        int overAvgMonths = 0;
        for (int sale : sales) {
            if (sale > calculateAvg(sales)) {
                overAvgMonths += 1;
            }
        }
        return overAvgMonths;
    }
}

