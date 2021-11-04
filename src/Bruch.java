public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        return (double) numerator / denominator;
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return numerator + "/" + denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */

        int num = getNumerator();
        int den = getDenominator();

        Bruch ergebnis = new Bruch (num * b2.getNumerator(), den * b2.getDenominator());

        return ergebnis;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        int num = getNumerator();
        int den = getDenominator();

        int b2num = b2.getNumerator();
        int b2den = b2.getDenominator();

        int b3num = b3.getNumerator();
        int b3den = b3.getDenominator();

        Bruch ergebnis2 = new Bruch (num * b2num * b3num, den * b2den * b3den);
         return ergebnis2;

    }
}
