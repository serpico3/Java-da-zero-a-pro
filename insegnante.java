package lezione_uno;

public class insegnante extends persona
{
    String insegnamento = "matematica";
    String[] classi = {"1D", "2D", "3D"};
    insegnante(String nome, String cognome, int eta, String colore)
    {
        super(nome, cognome, eta, colore);
    }

    void insegna()
    {
        System.out.println("sto insegnando ");
    }
}
