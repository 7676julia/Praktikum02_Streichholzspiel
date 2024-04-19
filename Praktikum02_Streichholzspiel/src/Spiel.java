public class Spiel {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    //Datenfelder
    private int currentAnzahlHoelzer = 0;

    //Konstruktor
    public Spiel(int startAnzahlHoelzer) {
        while (currentAnzahlHoelzer != 0) {
            computerZiehen(1);
            menschZiehen(1);
        }
    }

    //Methoden
    public void computerZiehen (int anzahlHoelzer) {
        // Method code here
    }
    public void menschZiehen (int anzahlHoelzer) {
        // Method code here
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

