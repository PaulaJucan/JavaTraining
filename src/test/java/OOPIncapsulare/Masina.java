package OOPIncapsulare;

public class Masina {

    //Incapsulare=conceptul prin care tinem departe de exterior valorile variabilelor
    //Private=acces control care blocheaza valorile variabilelor sa fie vazute inafara clasei in care le-ai declarat
    //Ca sa vedem/modificam valorile folosim valorile de "get" si "set"
    //Polimorfismul static sau dinamic

    private String brand;
    private String model;
    private Integer pret;

    //Polimorfismul static sau dinamic
    //Polimorfismul dinamic=intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //Polimorfismul static=mai multe metode prin acelasi nume se pot diferentia prin nr de parametrii si tipul lor
    //P dinamic=override
    //P static=overload
    //P static nu se poate aplica la metodele cu return fara parametrii



    public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Definim o metoda pe care o vom suprascrie

    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar o masina ");
    }


}
