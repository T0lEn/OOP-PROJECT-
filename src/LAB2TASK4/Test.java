package LAB2TASK4;

public class Test {

    public static void main(String[] args) {
        Circuit a = new Resistor(6);
        Circuit b = new Resistor(2);
        Circuit c = new Resistor(1);
        Circuit d = new Resistor(2);
        Circuit e = new Resistor(7);
        Circuit f = new Series(a, b);
        Circuit p = new Series(f, c);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        circuit.applyPotentialDifference(28);

        System.out.println(circuit);
    }
}
