package OOPMostenire;

public class Sport {
    public String Nume;
    public String Denumire;
    public Boolean esteEchipa;
    public Integer NrMembri;

    public Sport(String nume, String denumire, Boolean esteEchipa, Integer nrMembri) {
        Nume = nume;
        Denumire = denumire;
        this.esteEchipa = esteEchipa;
        NrMembri = nrMembri;
    }

    //OOP Mostenire=principiul pe baza caruia clasa parinte poate sa fie mostenita de n clase copii
    //ex:Casa bunicilor cu nepotii
    //In Java putem mostenii o singura clasa.In Pyton se pot mostenii mai multe.
    //In momentul in care clasa copil mosteneste clasa parinte trebuie sa apelam constructorul din clasa parinte

    public void InfoSport(){
        System.out.println(Nume);
        System.out.println(Denumire);
        System.out.println(esteEchipa);
        System.out.println(NrMembri);
    }
}
