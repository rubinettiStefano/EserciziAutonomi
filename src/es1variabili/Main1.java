package es1variabili;
public class Main1 
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        p.name = "Stefano";
        p.surname = "Rubinetti";

        metodino1(p);

        //il nome della persona in p arrivati a questa riga è "Stefano" o "Pippo", e perchè?
    }

    public static void metodino1(Person in)
    {
        in.name = "Pippo";
    }
}
