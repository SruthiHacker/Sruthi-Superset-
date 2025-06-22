public class FinancialForecast {

    
    public static double futureValue(double presentValue, double rate, int periods) {
        if (periods == 0) return presentValue;
        return (1 + rate) * futureValue(presentValue, rate, periods - 1);
    }

    
    public static double futureValueMemo(double presentValue, double rate, int periods, double[] memo) {
        if (periods == 0) return presentValue;
        if (memo[periods] != 0) return memo[periods];

        memo[periods] = (1 + rate) * futureValueMemo(presentValue, rate, periods - 1, memo);
        return memo[periods];
    }
}
