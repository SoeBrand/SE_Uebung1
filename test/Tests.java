import org.hbrs.se.ws20.uebung1.view.Client;

public class Tests {
    public static void main(String[] args) {
        Client c = new Client();
        System.out.println("Expected: Das Ergebnis der Berechnung: [eins]");
        System.out.print("Returned: "); c.display(1);
        System.out.println("----------------");

    }

}
