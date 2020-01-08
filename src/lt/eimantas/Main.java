package lt.eimantas;

public class Main {

    private String _failoVardas = "vardai.txt";

    public Main() {
        Klase objektas = new Klase();
        objektas.atidarytiFaila(_failoVardas);
        objektas.skaitymasIsFailo();
    }

    public static void main(String[] args) {
        // write your code here
        Main object = new Main();
    }
}