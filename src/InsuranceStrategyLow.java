public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 1825;
    }

    @Override
    public double getWeight() {
        return 0.01;
    }

    @Override
    public int getAdjustment() {
        return 5000;
    }
}
