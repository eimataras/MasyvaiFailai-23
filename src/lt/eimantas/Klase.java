package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;

public class Klase {
    private FileReader _in;
    private BufferedReader _bufferis;

    public void atidarytiFaila(String _failoVardas) {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {
            System.out.println("Nepavyko atidaryti failo");
        }
    }

    public void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                System.out.println(eilute);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {
        }
    }
}

