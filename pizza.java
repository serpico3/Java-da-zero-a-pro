package lezione_uno;

public class pizza
{
    String impasto;
    String salsa;
    String formaggio;
    String extra;

    pizza(String impasto, String salsa, String formaggio, String extra)
    {
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio=formaggio;
        this.extra=extra;
    }
    pizza(String impasto)
    {
        this.impasto = impasto;
    }
    pizza(String impasto, String salsa)
    {
        this.impasto = impasto;
        this.salsa = salsa;
    }
    pizza(String impasto, String salsa, String formaggio)
    {
        this.impasto=impasto;
        this.salsa=salsa;
        this.formaggio=formaggio;
    }
}
