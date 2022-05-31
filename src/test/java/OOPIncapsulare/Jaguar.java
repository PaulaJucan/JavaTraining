package OOPIncapsulare;

public class Jaguar extends Masina{


    public Jaguar(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }
    @Override
    public void cumparaMasina(){
        System.out.println("Nu cumpar jaguar");
        super.cumparaMasina();
    }
}
