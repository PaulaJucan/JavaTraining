package OOPAbstract;

public abstract class PersoanaAbstract {

    //Abstractizare=conceptul pe baza caruia definim comportamentul unei clase
    //Recunoastem clasa abstracta dupa -"abstract"
    //Clasa abstracta poate sau nu sa contina metode abstracte
    //O clasa poate extinde o clasa abstracta
    //O clasa abstracta poate sa implementeze o clasa interfata
    //Se poate mostenii o singura clasa abstracta
    //Clasa care mosteneste clasa abstracta=> mosteneste toate metodele abstracte
    //Clasa abstracta poate sa contina un constructor=> nu poti crea obiecte

    abstract void Munceste();
    abstract void PrimesteSalar();
    abstract void Invata();
    abstract void PrimesteBursa();
    abstract void Someaza();
    abstract void PrimesteAjutor();

    public void VerificaVarsta(Integer varsta){
        if (varsta>=18){
            System.out.println("Persoana e majora");
        }
        else {
            System.out.println("Persoana e minora");
        }
    }
}
