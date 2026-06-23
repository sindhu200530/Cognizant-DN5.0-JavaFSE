public class FinancialForecast {

    public static double futureValue(double amount,
                                     double growthRate,
                                     int years) {

        if (years == 0) {
            return amount;
        }

        return futureValue(amount, growthRate, years - 1)
                * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double forecast =
                futureValue(currentValue, growthRate, years);

        System.out.printf(
                "Future Value after %d years = %.2f",
                years,
                forecast
        );
    }
}