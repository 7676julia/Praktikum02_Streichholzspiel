public class Ausgabe {
    
    //Methoden
    public static void zahleEingeben() {
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }
    public static void keineZahl() {
        System.out.println("Das ist keine Zahl!");
    }
    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl ist nicht im Bereich!(1-3). Bitte geben Sie eine Zahl zwischen 1 und 3 ein:");
    }
    public static void menschGewinnt() {
        System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
    }
    public static void computerGewinnt() {
        System.out.println("Leider hat der Computer gewonnen!");
    }
    public static void zugNichtMoeglich() {
        System.out.println("Der Zug ist nicht möglich, da nicht genug Streichhölzer auf dem Tisch sind!");
    }
    public static void spielstand (int currentAnzahlHoelzer) {
        System.out.println("Auf dem Tisch liegen noch " + currentAnzahlHoelzer + " Streichhölzer.");
    }
    public static void menschZug (int gezogeneHoelzer, int verbleibendeHoelzer) {
        System.out.println("Sie haben " + gezogeneHoelzer + " Streichhölzer gezogen. Es verbleiben noch " + verbleibendeHoelzer + " Streichhölzer auf dem Tisch.");
    }
    public static void computerZug (int gezogeneHoelzer, int verbleibendeHoelzer) {
        System.out.println("Der Computer hat " + gezogeneHoelzer + " Streichhölzer gezogen. Es verbleiben noch " + verbleibendeHoelzer + " Streichhölzer auf dem Tisch.");
    }
}
