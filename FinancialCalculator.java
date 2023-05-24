public class FinancialCalculator extends Calculator{
    public double calculateInterest(double principal, double rate, double time) {
        return principal * rate * time;
    }

    public double calculateFutureValue(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate, time);
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}
