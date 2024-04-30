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
        while (minus > currentAnzahlHoelzer) {
            Ausgabe.zugNichtMoeglich();
            minus = Eingabe.leseHoelzer();
        }
            currentAnzahlHoelzer -= minus;
            Ausgabe.menschZug(minus, currentAnzahlHoelzer);
        }
    
    private int berechneComputerZug() {
        int minus = 0;
        minus = (currentAnzahlHoelzer - 1) % 4;     //modulo stellt sicher, das Ergenbis zwischen 1 und 3 liegt
        //man darf nicht 0 ziehen
        if (minus == 0) {
            //wenn durch 4 teilbar, dann zuffällig 1, 2 oder 3 ziehen
            minus = (int) (Math.random() * 3) + 1;
        }
        return minus;
    }

    //Getter und Setter
    public int getCurrentAnzahlHoelzer() {
        return currentAnzahlHoelzer;
    }

    public void setCurrentAnzahlHoelzer(int currentAnzahlHoelzer) {
        this.currentAnzahlHoelzer = currentAnzahlHoelzer;
    }

    
}

