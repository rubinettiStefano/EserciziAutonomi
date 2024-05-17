package es1variabili;

public class Main3 
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        p.name = "Stefano";
        p.surname = "Rubinetti";

        p = metodino1(p);
        
        //il nome della persona in p arrivati a questa riga è "Stefano" o "Pippo", e perchè?
    }

    public static Person metodino1(Person in)
    {
        in = new Person();
        in.name = "Pippo";
        in.surname = "Rubinetti";

        return in;
    }
}
