package OOP_Interfete;

public interface Angajat {

    //Interfata contine doar metode abstracte(se defineste tipul metodei fara sa contina body)
    //Se recunoaste cupa cuvantul Inteface
    //Poate sa contina variabile sau nu
    //Intefarta nu se mosteneste ci se implementeaza
    //Clasa care implementeaza interfata trebuie sa implementeze toate metodele interfetei
    //O clasa poate sa implementeze mai multe intefete
    //O clasa abstracta pote sa implementeze o interfata
    //O interfata nu contine un consructor---> nu putem declara obiecte

    void Munceste();
    void PrimesteSalar();
}
