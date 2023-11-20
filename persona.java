package lezione_uno;

public class persona
{
    String nome;
    String cognome;
    int eta;
    String colore;
    static int numeroPersone;

    persona(String nome, String cognome, int eta, String colore)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.colore=colore;
        numeroPersone++;
    }

    public String toString()
    {
        String stringa = this.nome + this.cognome;
        return stringa;
    }
    void saluta(persona personadasalutare)
    {
        System.out.println("ciao " + personadasalutare +" sono "+ this.nome);
    }
    void addizione(int a, int b)
    {
        int risultato=a+b;
        System.out.println("il risultato è "+risultato);
        this.qwerty(risultato);
    }

    void saluta()
    {
        System.out.println("ciao");
    }

    void qwerty(int prova)
    {
        System.out.println("il risultato è "+prova);

    }

}


