import org.hbrs.se.ws20.uebung1.view.Client;

public class Tests {
    public static void main(String[] args) {
        Client c = new Client();
        System.out.println("Expected: Das Ergebnis der Berechnung: [eins]");
        System.out.print("Returned: "); c.display(1);
        System.out.println("----------------");
        System.out.println("Expected: Das Ergebnis der Berechnung: [Übersetzung der Zahl [0] nicht möglich (1.0)]");
        System.out.print("Returned: "); c.display(0);
        System.out.println("----------------");
        System.out.println("Expected: Das Ergebnis der Berechnung: [Übersetzung der Zahl [-1] nicht möglich (1.0)]");
        System.out.print("Returned: "); c.display(-1);
        System.out.println("----------------");
        System.out.println("Expected: Das Ergebnis der Berechnung: [Übersetzung der Zahl [12] nicht möglich (1.0)]");
        System.out.print("Returned: "); c.display(12);
    }

}
