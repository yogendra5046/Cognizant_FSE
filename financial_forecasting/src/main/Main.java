package main;
public class Main {

    public static void main(String[] args) {

        double currentRevenue = 10000;

        double growthRate = 0.10;

        int years = 3;

        double predictedRevenue =
                FinancialForecast.forecast(currentRevenue,
                                           growthRate,
                                           years);

        System.out.println("Predicted Revenue after "
                + years + " years = "
                + predictedRevenue);

    }
}