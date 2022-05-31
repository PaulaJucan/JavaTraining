package OOP_Interfete;
import org.junit.Test;

public class InterfataTest {
    @Test
    public void metodaIntefata(){
        //PersoanaAngajat
        PersoanaAngajat persoanaAngajat=new PersoanaAngajat("Nume1","Prenume1","Angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();

        //PersoanaSomer
        PersoanaSomer persoanaSomer=new PersoanaSomer("Nume2","Prenume2","Somer");
        persoanaSomer.Someaza();
        persoanaSomer.PrimesteAjutor();

        //PersoanaStudent
    }


}
