package LAB2TASK4;

public class Series extends Circuit {
    private Circuit firstCircuit;
    private Circuit secondCircuit;

    public Series(Circuit a, Circuit b) {
        this.firstCircuit = a;
        this.secondCircuit = b;
    }

    @Override
    public double getResistance() {
        return firstCircuit.getResistance() + secondCircuit.getResistance();
    }

    @Override
    public double getPotentialDifference() {
        return firstCircuit.getPotentialDifference() + secondCircuit.getPotentialDifference();
    }

    @Override
    public void applyPotentialDifference(double V) {
        double current = V / getResistance();
        firstCircuit.applyPotentialDifference(firstCircuit.getResistance() * current);
        secondCircuit.applyPotentialDifference(secondCircuit.getResistance() * current);
    }

    @Override
    public String toString() {
        return "Series: " + super.toString() + "\nFirst: " + firstCircuit + "\nSecond: " + secondCircuit;
    }
}
