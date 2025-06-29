public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 5;


        double forecast = FinancialForecast.futureValue(presentValue, growthRate, years);
        System.out.printf("📊 Forecast without memoization for %d years: ₹%.2f\n", years, forecast);


        double[] memo = new double[years + 1];
        double optimizedForecast = FinancialForecast.futureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("⚡ Optimized Forecast with memoization: ₹%.2f\n", optimizedForecast);
    }
}
