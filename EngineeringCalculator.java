public class EngineeringCalculator extends Calculator{
    public double calculatePower(double voltage, double current) {
        return voltage * current;
    }

    public double calculateResistance(double voltage, double current) {
        return voltage / current;
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
