package ObiectConstructor;

import java.util.List;

//un obiect reprezinta instanta unei clase
//Obiect=instanta unei clase
//Constructor=are ca rol sa initializeze variabilele unei clase
//nu puntem avea un obiect fara un constructor si invers
//Tipuri constructor= contructor cu parametrii si constructor fara parametrii
//By default avem un constructor fara parametrii in orice clasa
//Intr-o clasa putem avea n contructori
//Structura contructor: public, are numele clasei (are sau nu parametrii). ex public Student
// Nu exista constructor cu "return"

public class Student {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;
    public List<Integer> noteMaghiara;


    public Student(String Nume,String Prenume,Integer Varsta,Double Inaltime,
            Character Sex,Boolean areBursa,List<Integer>noteMatematica,List<Integer>noteRomana){

        this.Nume=Nume;
        this.Prenume=Prenume;
        this.Varsta=Varsta;
        this.Inaltime=Inaltime;
        this.Sex=Sex;
        this.areBursa=areBursa;
        this.noteMatematica=noteMatematica;
        this.noteRomana=noteRomana;


    }
    //Facem un alt constructor doar cu noteMatematica


    public Student(String nume, String prenume, Integer varsta, Double inaltime,
                   Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }
    //Facem un constructor cu note maghiara

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa,
                   List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
        this.noteMaghiara = noteMaghiara;
    }

    public void InfoStudent(){
        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenumele stundetului este: "+Prenume);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Inaltimea studentului este: "+Inaltime);
        System.out.println("Sexul studentului este: "+Sex);
        System.out.println("Are studentul bursa? "+areBursa);

    }

    public void InfoNote(String Materie){
      if (Materie.equals("romana")||Materie.equals("Romana")) {
          System.out.println("Notele studentului la romana sunt: ");
          PrintNoteLista(noteRomana);
      }

      if (Materie.equals("matematica")||Materie.equals("Matematica")) {
            System.out.println("Notele studentului la matematica sunt: ");
          PrintNoteLista(noteMatematica);

      }
      if (Materie.equals("maghiara")||Materie.equals("Maghiara")) {
            System.out.println("Notele studentului la maghiara sunt: ");
            PrintNoteLista(noteMaghiara);
      }


    }

    public void PrintNoteLista(List<Integer>note){
        for (Integer index = 0; index < note.size(); index++) {
            System.out.println(note.get(index));
        }

    }

    public void CalculMedie(String Materie){
        if (Materie.equals("matematica")||Materie.equals("Matematica")) {
            System.out.println("Media studentului la matematica este: ");
            PrintMedie(noteMatematica);
        }
        if (Materie.equals("romana")||Materie.equals("Romana")) {
            System.out.println("Media studentului la romana este: ");
            PrintMedie(noteRomana);
        }
        if (Materie.equals("maghiara")||Materie.equals("Maghiara")) {
            System.out.println("Media studentului la maghiara este: ");
            PrintMedie(noteMaghiara);
        }



    }

    public void PrintMedie(List<Integer>note){
        double suma=0;
        Integer nrelemente=note.size();

        for (Integer index = 0; index < note.size(); index++) {
            suma=suma+note.get(index);

        }
        double Medie=suma/nrelemente;
        System.out.println(Medie);
    }
}
