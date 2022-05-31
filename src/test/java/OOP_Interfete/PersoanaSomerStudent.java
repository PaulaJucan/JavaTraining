package OOP_Interfete;

public class PersoanaSomerStudent extends PersoanaIntefata implements Somer,Student{
    public PersoanaSomerStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Studentul/Somer "+getNume()+" "+getPrenume()+" someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Studentul/Somer"+getNume()+" "+getPrenume()+" primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("Studentul/Somer "+getNume()+" "+getPrenume()+" invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Studentul/Somer "+getNume()+" "+getPrenume()+" primeste bursa");

    }
}
