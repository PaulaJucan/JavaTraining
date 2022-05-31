package Tema;

import org.junit.Test;



public class Tema1 {

    public Integer Varsta;
    public String Nume;
    public String Prenume;




    @Test
    public void Tema1Test() {
        Hello();
        AtribuireVariabilaVarsta();
        NumePrenume();



    }

    public void Hello() {
        System.out.println("Hello World!");
    }

    public void AtribuireVariabilaVarsta() {
        Varsta = 37;
        System.out.println(Varsta);
    }

    public void NumePrenume() {
        Nume = "Jucan";
        Prenume = "Paula";
        System.out.println(Nume);
        System.out.println(Prenume);

    }




}








