package lezione_uno;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws IOException {
        //variabili
        /*int x=5;
        System.out.println(x);
        x=100;
        System.out.println(x);
        double z = 0.19;
        System.out.println(z);
        boolean var_bool = true;
        System.out.println(var_bool);
        byte var_byte=127;
        System.out.println(var_byte);
        char var_char = 'x';
        String y = "parola";
        System.out.println(y.toUpperCase()); */
        //input utente
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("nome");
        String nome= scanner.nextLine();
        System.out.println("ciao " + nome);

        System.out.println("età");
        int anni= scanner.nextInt();*/
        //math
        /*System.out.println(Math.abs(-18));
        System.out.println(Math.min(9, 12));
        System.out.println(Math.PI); */
        //if
        /*int a=10;
        if(a<10)
        {
            System.out.println("<");
        }
        else if(a==10)
        {
            System.out.println("=");
        }
        else if(a>10)
        {
            System.out.println(">");
        }*/
        //switch
        /*int a = 10;
        switch(a)
        {
            case 1:
            {
                System.out.println("1");
                break;
            }
            case 10:
            {
                System.out.println("10");
                break;
            }
            default:
            {
                System.out.println("default");
                break;
            }
        }*/
        //do while
        /*int i=0;
        while(i < 5)
        {
            System.out.println(i);
            i++;
        }
        int b=0;

        do
        {
            System.out.println(b);
            b++;
        }
        while(b<5);*/
        //for
        /*for(int i=0; i<5; i++)
        {
            System.out.println("riga"+i);
            for(int j=0; j<5; j++)
            {
                System.out.println("colonna"+j);
            }
        }
        int[] numeri = {10, 20, 30, 40, 50};
        for(int numero: numeri)
        {
            System.out.println(numero);
        }*/
        //array
        /*int[] numeri = new int[3];
        numeri[0]=10;
        numeri[1]=20;
        numeri[2]=30;
        System.out.println(numeri.length);
        int[] dati= {10,20,30,40};
        System.out.println(dati.length);
        for(int i=0; i<numeri.length;i++)
        {
            System.out.println(dati[i]);
        }
        for(int numero: numeri)
        {
            System.out.println(numero);
        }*/
        //array multidimensionali
        /*String[][] classi = new String[3][3];

        classi[0][0] = "luca";
        classi[0][1] = "marco";
        classi[0][2] = "andrea";

        classi[1][0] = "eleonora";
        classi[1][1] = "claudia";
        classi[1][2] = "alvise";

        classi[2][0] = "davide";
        classi[2][1] = "diego";
        classi[2][2] = "luca";

        System.out.println(classi[2][0]);

        for(int classe=0;classe<classi.length;classe++)
        {
            System.out.println();
            for(int studente=0;studente<classi[classe].length;studente++)
            {
                System.out.print(classi[classe][studente]+" ");
            }
        }

        String[][] parole =
        {
            {"uno","due","tre"},
            {"quattro","cinque","sei"},
            {"sette","otto","nove"}
        };
        for(String[] parola:parole)
        {
            System.out.println();
            for(String numero: parola)
            {
                System.out.print(numero + " ");
            }
        }*/
        //wrapper classes
        /*Boolean vero = true;
        Character carattere = 'a';
        Integer numero = 5;
        Double virgola = 5.23;
        String stringa = "ciao mondo";

        boolean a=vero;
        char b='a';
        int c=5;
        double d=5.23;
        if(vero==a)
        {
            System.out.println("ciao");
        }*/
        //arraylist
        /*ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        persone.set(2, "Paola");
        persone.remove(0);
        for(int i=0; i<persone.size(); i++)
        {
            System.out.println(persone.get(i));
        }*/
        //arraylist multidimensionali
        /*ArrayList<ArrayList<String>> classi = new ArrayList();

        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("luca");
        classe1.add("Marco");
        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("Anna");
        classe2.add("Orazio");

        classi.add(classe1);
        classi.add(classe2);
        for(int i=0; i<classi.size(); i++)
        {
            System.out.println();
            for(int j=0; j<classi.get(i).size(); j++)
            {
                System.out.println(classi.get(i).get(j));
            }
        }*/
        //metodi
        /*int ris = addizione(5,10);
        System.out.println(ris);*/
        //classi e costruttori
        /*persona persona1 = new persona("Luca", "Rossi", 25, "blu");
        persona persona2 = new persona("Marco", "Bianchi", 19, "verde");

        System.out.println(persona1.eta);
        System.out.println(persona2.eta);*/
        //scope delle variabili
        /*persona persona1 = new persona("Mario", "Rossi", 25, "Viola");
        persona1.saluta();
        persona1.addizione(5,10);*/
        //overloaded constructor
        /*pizza pizza1 = new pizza("integrale", "pomodoro", "mozzarella", "patatine");
        pizza pizza2 = new pizza("farina");
        pizza pizza3 = new pizza("farina", "pomodoro", "mozzarella");
        System.out.println(pizza1.impasto);
        System.out.println(pizza2.impasto);*/
        //to string
        /*persona persona = new persona("Luca", "Rossi", 25, "blu");
        System.out.println(persona);*/
        //array di oggetti
        /*persona[] persone = new persona[3];
        persona persona1 = new persona("Luca", "Rossi", 25, "viola");
        persona persona2 = new persona("Giulia","verdi",19,"giallo");
        persona persona3 = new persona("Anna","neri", 23, "verde");
        persone[0]=persona1;
        persone[1]=persona2;
        persone[2]=persona3;

        System.out.println(persone[1]);*/
        //oggetti come parametri di metodi
        /*persona persona1 = new persona("Luca", "rossi", 25, "verde");
        persona persona2 = new persona("Marco", "verdi", 19, "arancione");
        persona1.saluta(persona2);*/
        //final e static
        /*final int prova=5;
        //prova=10;
        System.out.println(prova);
        persona persona1 = new persona("luca", "rossi", 25, "verde");
        persona persona2 = new persona("mario", "verdi", 19, "viola");

        System.out.println(persona1);
        System.out.println(persona.numeroPersone);*/
        //ereditarietà
        /*persona persona1 = new persona("luca", "rossi", 25, "viola");
        persona1.saluta();
        studente studente1 = new studente("Luca", "rossi", 25, "viola");
        studente1.saluta();
        studente1.studia();*/
        //classi astratte
        /*macchina macchina1 = new macchina();
        macchina1.frena();
        //veicolo inutilizzabile*/
        //polimorfismo
        /*studente studente1 = new studente("Luca", "verdi", 12, "blu");
        insegnante insegnante1 = new insegnante("Marco", "verdi", 30, "giallo");

        persona[] classe = {studente1, insegnante1};
        for(persona persona: classe)
        {
            persona.saluta();
        }*/
        //exception
        /*Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("inserisci un numero");
            int x = scanner.nextInt();
            System.out.println("inserisci secondo numero");
            int y= scanner.nextInt();
            int result=x/y;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("non valido");
        }
        catch(InputMismatchException e)
        {
            System.out.println("non valido");
        }*/
        //lavorare con i  file
        /*File file = new File("prova.txt");
        if (file.exists())
        {
            System.out.println("il  file esiste");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else
        {
            System.out.println("il file non esiste");
        }
        try
        {
            FileWriter writer = new FileWriter("prova.txt");
            writer.write("ciao sono Diego \nprova stampa");
            writer.append("\ntest");
            writer.close();
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();
            while (data != -1)
            {
                System.out.print((char)data);
                data=reader.read();
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }*/
        //casting
        /*double x = 9;
        System.out.println(x);
        System.out.println((int)x);*/
        //data e ora
        /*LocalDate x = LocalDate.now();
        LocalTime y = LocalTime.now();
        System.out.println(y);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        System.out.println(x.format(format));*/
        //hasmap
        /*HashMap<String, String> capitali = new HashMap<String, String>();
        capitali.put("italia", "roma");
        capitali.put("Francia", "parigi");
        System.out.println(capitali);
        capitali.remove("Francia");
        System.out.println(capitali);*/
        //iteratori
        /*ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Sofia");
        persone.add("paolo");

        Iterator<String> it = persone.iterator();

        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());

        while(it.hasNext())
        {
            String persona=it.next();
            System.out.println(it.next());
            if(persona == "Marco")
            {
                it.remove();
            }
        }*/

   }
    //metodo
    /*static int addizione(int primo, int secondo)
    {
        int ris = primo + secondo;
        return ris;
    }*/
    //overloaded metods
    /*static int addizione(int primo, int secondo)
    {
        int ris = primo + secondo;
        return ris;
    }
    static int addizione(int primo, int secondo, int terzo)
    {
        int ris = primo + secondo;
        return ris;
    }*/
}