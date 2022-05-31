package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //Obiect= instanta unei clase
    //Obiectul este strict legat de constructor
    //Dintr-o clasa putem declara n obiecte
    //Obiectele se diferentiaza pe baza numelui
    //Structura obiect:nume clasa+nume obiect=new nume clasa(valori parametrii)
    //Recunoaste un obiect dupa cuvantul "new"

    @Test
    public void MetodaTest() {
        //Primul obiect
        List<Integer> noteRomanaPaula = new ArrayList<>();
        noteRomanaPaula.add(10);
        noteRomanaPaula.add(9);
        noteRomanaPaula.add(8);
        noteRomanaPaula.add(7);
        List<Integer> noteMatematicaPaula = new ArrayList<>();
        noteMatematicaPaula.add(10);
        noteMatematicaPaula.add(9);
        noteMatematicaPaula.add(7);
        noteMatematicaPaula.add(4);

        Student PaulaJucan = new Student("Jucan", "Paula", 37, 1.63, 'F',
                true, noteMatematicaPaula, noteRomanaPaula);
        //PaulaJucan.InfoStudent();
        // PaulaJucan.InfoNote("romana");
        // PaulaJucan.InfoNote("Matematica");
        //PaulaJucan.Prenume="Bianca";
        //PaulaJucan.InfoStudent();

        List<Integer> noteRomanaAlex = new ArrayList<>();
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(4);
        noteRomanaAlex.add(7);
        noteRomanaAlex.add(7);
        List<Integer> noteMatematicaAlex = new ArrayList<>();
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(5);
        noteMatematicaAlex.add(4);
        noteMatematicaAlex.add(9);

        Student DorhaAlex = new Student("Dorha", "Alex", 27, 1.70, 'M',
                false, noteMatematicaAlex, noteRomanaAlex);
        //DorhaAlex.InfoStudent();


        //Declaram un obiect pentu un al doilea constructor
        List<Integer> noteMatematicaBia = new ArrayList<>();
        noteMatematicaBia.add(6);
        noteMatematicaBia.add(5);
        noteMatematicaBia.add(4);
        noteMatematicaBia.add(9);
        Student PopBia = new Student("Pop", "Bia", 27, 1.70, 'F',
                false, noteMatematicaBia);
        //PopBia.InfoStudent();
        //PopBia.InfoNote("Matematica");

        List<Integer> noteMatematicaGyuri = new ArrayList<>();
        noteMatematicaGyuri.add(5);
        noteMatematicaGyuri.add(5);
        noteMatematicaGyuri.add(4);
        noteMatematicaGyuri.add(9);
        List<Integer> noteRomanaGyuri = new ArrayList<>();
        noteRomanaGyuri.add(6);
        noteRomanaGyuri.add(5);
        noteRomanaGyuri.add(4);
        noteRomanaGyuri.add(9);
        List<Integer> noteMaghiaraGyuri = new ArrayList<>();
        noteMaghiaraGyuri.add(6);
        noteMaghiaraGyuri.add(5);
        noteMaghiaraGyuri.add(4);
        noteMaghiaraGyuri.add(9);

        Student PappGyuri = new Student("Papp", "Gyuri", 27, 1.70, 'M',
                false, noteMatematicaGyuri,noteRomanaGyuri,noteMaghiaraGyuri);

        //PappGyuri.InfoStudent();
        //PappGyuri.InfoNote("Maghiara");
        PappGyuri.CalculMedie("Matematica");

    }


}

