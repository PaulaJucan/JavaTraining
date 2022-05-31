package OOPMostenire;

import java.util.List;

public class Fotbal extends Sport {

    public Boolean Capitan;
    public Integer NrEchipamente;
    public List<String>Reguli;



    public Fotbal(String nume, String denumire, Boolean esteEchipa, Integer nrMembri, Boolean Capitan,
                  Integer NrEchipamente,List<String>Reguli) {
        super(nume, denumire, esteEchipa, nrMembri);
        this.Capitan=Capitan;
        this.NrEchipamente=NrEchipamente;
        this.Reguli=Reguli;

    }
    public void InfoFotbal(){
        System.out.println("Informatiile despre fotbal sunt: ");
        InfoSport();
        System.out.println(Capitan);
        System.out.println(NrEchipamente);
        System.out.println(Reguli);

    }

}
