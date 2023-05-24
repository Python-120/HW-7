public class AccountingCalculator extends Calculator{
    public double calculateProfit(double revenue, double expenses) {
        return revenue - expenses;
    }

    public double calculateGrossMargin(double revenue, double costOfGoodsSold) {
        return (revenue - costOfGoodsSold) / revenue * 100;
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
