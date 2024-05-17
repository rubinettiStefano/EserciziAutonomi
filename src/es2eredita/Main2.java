package es2eredita;

import java.util.ArrayList;

public class Main2 
{
    public static void main(String[] args) 
    {
        Superclasse s1 = new Sottoclasse1();

        s1.a = 10;
        s1.b = "Ciao";
       

        Superclasse s2 = new Sottoclasse2();

        s2.a = 9;
        s2.b = "Bye";
       


        ArrayList<Superclasse> l = new ArrayList<>();

        //inserendo solo 2 righe sotto questa, fare in modo che il programma si comporti come nel main 1
        //NON TOCCARE LE RIGHE SOPRA

        sc1.c = 12.7;
        sc2.d = true;
        l.add(sc1);
        l.add(sc2);

        for(Superclasse s : l)
            System.out.println(s.toString());

        

    }

}
