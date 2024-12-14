package LAB2TASK4;

public class Resistor extends Circuit {
    private double potentialDifference;
    private double resistance;
    public Resistor() {
    }
    public Resistor(double resistance) {

        setResistance(resistance);
    }

    public void setPotentialDifference(double potentialDifference) {

        this.potentialDifference = potentialDifference;
    }
    public void setResistance(double resistance) {

        this.resistance = resistance;
    }


    public double getResistance() {

        return resistance;
    }
    public double getPotentialDifference() {

        return potentialDifference;
    }
    public void applyPotentialDifference(double V) {

        setPotentialDifference(V);
    }

    public String toString() {

        return "Resistor: " + super.toString();
    }

}
