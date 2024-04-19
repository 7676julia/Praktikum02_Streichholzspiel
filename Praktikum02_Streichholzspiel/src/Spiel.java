public class Spiel {
    
    //Datenfelder
    private int currentAnzahlHoelzer = 0;

    //Konstruktor
    public Spiel(int startAnzahlHoelzer) {
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
        // Method code here
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
    private void berechneComputerZug() {
        // Method code here
    }

    //Getter und Setter
    public int getCurrentAnzahlHoelzer() {
        return currentAnzahlHoelzer;
    }

    public void setCurrentAnzahlHoelzer(int currentAnzahlHoelzer) {
        this.currentAnzahlHoelzer = currentAnzahlHoelzer;
    }

    
}

