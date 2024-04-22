import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {
    
    public static int leseZahl() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int zahl = 0;
        boolean isValid = false;
        while (!isValid) {
            Ausgabe.zahlEingeben();
            try {
            String input = br.readLine();
            zahl = Integer.parseInt(input);
            isValid = true;
            } catch (IOException e) {
            e.printStackTrace();
            } catch (NumberFormatException e) {
            Ausgabe.keineZahl();
            }
        }
        return zahl;
    }
    
    public static int leseHoelzer () {
        int hoelzer = Eingabe.leseZahl();
        while (hoelzer < 1 || hoelzer > 3) {
            Ausgabe.zahlNichtImBereich();
            hoelzer = Eingabe.leseZahl();
        }
        return hoelzer;
    }
}
