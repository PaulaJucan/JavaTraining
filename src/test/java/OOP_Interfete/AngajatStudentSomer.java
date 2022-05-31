package OOP_Interfete;

public class AngajatStudentSomer extends PersoanaIntefata implements Angajat,Student,Somer{

    public AngajatStudentSomer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste() {
        System.out.println("AngajatStudentSomer "+getNume()+" "+getPrenume()+" munceste");

    }

    @Override
    public void PrimesteSalar() {
        System.out.println("AngajatStudentSomer "+getNume()+" "+getPrenume()+" primeste salar");

    }

    @Override
    public void Someaza() {
        System.out.println("AngajatStudentSomer"+getNume()+" "+getPrenume()+" someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("AngajatStudentSomer"+getNume()+" "+getPrenume()+" primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("AngajatStudentSomer "+getNume()+" "+getPrenume()+" invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("AngajatStudentSomer "+getNume()+" "+getPrenume()+" primeste bursa");

    }
}
