package forecasting;
public class FinancialForecasting {
public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        double nextYearValue = currentValue * (1 + growthRate);
        return calculateFutureValue(nextYearValue, growthRate, years - 1);
    }
    public static void main(String[] args) {
        double initialAmount = 10000.0;  
        double annualGrowthRate = 0.08;  
        int forecastYears = 5;
        double futureValue = calculateFutureValue(initialAmount, annualGrowthRate, forecastYears);
        System.out.printf("Predicted future value after %d years: ₹%.2f%n", forecastYears, futureValue);
    }
}
