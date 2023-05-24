public class ProgrammableCalculator extends Calculator{
    public double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public double calculateCubeRoot(double number) {
        return Math.cbrt(number);
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
