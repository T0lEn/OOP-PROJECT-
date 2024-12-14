package LAB2TASK4;

public class Parallel extends Circuit {
    private Circuit firstCircuit;
    private Circuit secondCircuit;

    public Parallel(Circuit a, Circuit b) {
        this.firstCircuit = a;
        this.secondCircuit = b;
    }

    @Override
    public double getResistance() {

        return 1 / (1 / firstCircuit.getResistance() + 1 / secondCircuit.getResistance());
    }

    @Override
    public double getPotentialDifference() {
        return firstCircuit.getPotentialDifference();
    }

    @Override
    public void applyPotentialDifference(double V) {
        firstCircuit.applyPotentialDifference(V);
        secondCircuit.applyPotentialDifference(V);
    }

    @Override
    public String toString() {
        return "Parallel: " + super.toString() + "\nFirst: " + firstCircuit + "\nSecond: " + secondCircuit;
    }
}