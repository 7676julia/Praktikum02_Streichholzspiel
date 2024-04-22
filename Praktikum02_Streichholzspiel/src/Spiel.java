public class Spiel {
    
    //Datenfelder
    private int currentAnzahlHoelzer = 0;

    //Konstruktor
    public Spiel(int startAnzahlHoelzer) {
        System.out.println("Willkommen zum Streichholzspiel :)");
        currentAnzahlHoelzer = startAnzahlHoelzer;
        while (currentAnzahlHoelzer != 0) {
            computerZiehen();
            if (currentAnzahlHoelzer <= 0) {
                Ausgabe.menschGewinnt();
                break;  //?
            }
            menschZiehen();
            if (currentAnzahlHoelzer <= 0) {
                Ausgabe.computerGewinnt();
                break;  //?
            }
        }
    }

    //Methoden
    public void computerZiehen () {
        int minus= berechneComputerZug();
        currentAnzahlHoelzer -= minus;
        Ausgabe.computerZug(minus, currentAnzahlHoelzer);
    }
    public void menschZiehen () {
        int minus = Eingabe.leseHoelzer();  //Eingabe zwischen 1 und 3 des Spielers
        if (minus > currentAnzahlHoelzer) {
            Ausgabe.zugNichtMoeglich();
        } else {
            currentAnzahlHoelzer -= minus;
            Ausgabe.menschZug(minus, currentAnzahlHoelzer);
        }
        
    }
    private int berechneComputerZug() {
        return (int) (Math.random() * 3) + 1;
    }

    //Getter und Setter
    public int getCurrentAnzahlHoelzer() {
        return currentAnzahlHoelzer;
    }

    public void setCurrentAnzahlHoelzer(int currentAnzahlHoelzer) {
        this.currentAnzahlHoelzer = currentAnzahlHoelzer;
    }

    
}

