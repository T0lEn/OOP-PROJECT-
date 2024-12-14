package LAB2TASK4;

public abstract class Circuit {

    public abstract double getResistance();
    public abstract double getPotentialDifference();
    public abstract void applyPotentialDifference(double V);

    public double getPower() {

        return getCurrent() * getPotentialDifference();
    }

    public double getCurrent() {

        return getPotentialDifference() / getResistance(); // i*u
    }

    @Override
    public String toString() {
        return "U: " + getPotentialDifference() + "V, R = " + getResistance() + "Ohm, I = " + getCurrent() + "A, P = " + getPower() + "W";
    }
}
