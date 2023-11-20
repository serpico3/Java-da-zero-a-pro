package lezione_uno;

public class studente extends persona
{
    String materia = "storia";
    String classe = "2D";
    int[] voti = {9,9,9};

    studente(String nome, String cognome, int eta, String colore)
    {
        super(nome, cognome, eta, colore);
    }

    void studia()
    {
        System.out.println("sto studiando ");
    }
    @Override
    void saluta()
    {
        System.out.println("buongiorno ");

    }
}
