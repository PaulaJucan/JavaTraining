package OOPIncapsulare;

import java.util.List;

public class Audi extends Masina {
    public List<String>dotariInterioare;
    public List<String>dotariExterioare;

    public Audi(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }

    public void infoAudi(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());

    }

    //Suprascriem o metoda din clasa parinte

    @Override
    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar Audi ");
        super.cumparaMasina();

    }
    //Polimorfism static
    public void afiseazaMasini(){
        System.out.println("Nu avem masini");
    }
    public void afiseazaMasini(String brand){
        System.out.println("Nu avem masini");
    }
    public void afiseazaMasini(String brand,Integer an){
        System.out.println("Nu avem masini");
    }
    public void afiseazaMasini(Integer brand){
        System.out.println("Nu avem masini");
    }

    //Polimorfism static la metode cu return
    //P static se poate aplica doar la metodele cu return care au parametrii
    //Nu are nici o importanta numarul parametrilor sau tipul lor

    public String getNume(){
        return "Nicu";
    }
    public String getNume(Integer parametru){
        return "Nicu";
    }
    public String getNume(String parametru){
        return "Nicu";
    }




}
