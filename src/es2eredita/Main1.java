package es2eredita;

import java.util.ArrayList;

public class Main1 
{
    public static void main(String[] args) 
    {
        Sottoclasse1 s1 = new Sottoclasse1();

        s1.a = 10;
        s1.b = "Ciao";
        s1.c = 12.7;

        Sottoclasse2 s2 = new Sottoclasse2();

        s2.a = 9;
        s2.b = "Bye";
        s2.d = true;


        ArrayList<Superclasse> l = new ArrayList<>();

        l.add(s1);
        l.add(s2);

        for(Superclasse s : l)
            System.out.println(s.toString());

        //modificando solo le sottoclassi
        //fare in modo che il programma non dia errori e che stampi
        //Sono Sottoclasse 1 con a = 10, b = Ciao e c = 12.7
        //Sono Sottoclasse 2 con a = 9, b = Bye e d = true

    }
}
