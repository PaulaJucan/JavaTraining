package Structuri;

import org.junit.Test;

public class Matematica {
    //Structuri: -Alternative si Repetitive
    //Structuri alternative: if...then
    //                            else...
    //                       if... then...
    //                       switch {
    //                   case1
    //                   case2
    //                         }
    @Test
    public void MatematicaTest() {
        NumarMaiMareCa20();
        NumarMaiMareCaNumar(68, 15);
        NumarMaiMareCaNumar(15, 70);
        ParitateNumar();
        Numarestepar(20);
        VerificNumarImparDivizibilV2(5);
        VerificNumarImparDivizibilV2(10);
        VerificNumarImparDivizibilV2(9);
        VerificNumarImparDivizibilV2(14);
        PrinteazaZi("Marti");
    }

    //Verificam daca un nr e mai mare ca 20
    public void NumarMaiMareCa20() {
        if (38 > 20) {
            System.out.println("Numarul 38 este mai mare ca 20");
        } else {
            System.out.println("Numarul 38 este mai mic ca 20");
        }

    }

    public void NumarMaiMareCaNumar(Integer Numar, Integer Comparatie) {
        if (Numar > Comparatie) {
            System.out.println("Numarul" + Numar + " este mai mare ca " + Comparatie);
        } else {
            System.out.println("Numarul" + Numar + " este mai mic ca " + Comparatie);
        }

    }

    //Verificam daca un nr este par
    // "/" este folosit pt impartire
    //"%" este folosit la impartiere dar afiseaza restul
    // 4:2= 2.0  5:2=2.1  6:2=3 7:2=3.1
    public void ParitateNumar() {
        if (7 % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("numarul este impar");
        }
    }

    public void Numarestepar(Integer Number) {
        if (Number % 2 == 0) {
            System.out.println(Number + " numarul este par");
        } else {
            System.out.println(Number + " numarul este impar");
        }
    }

    //Verific daca un numar este impar si divizibil cu 5
    public void VerificNumarImparDivizibilV1(Integer Numar) {
        if (Numar % 2 == 1 && Numar / 5 == 0) {
            System.out.println(Numar + "este impar si divizibil cu 5");
        } else {
            System.out.println(Numar + "nu este impar si nici divizibil cu 5");
        }
    }

    public void VerificNumarImparDivizibilV2(Integer Numar) {
        if (Numar % 2 == 1) {
            if (Numar % 5 == 0) {
                System.out.println(Numar + " este impar si divizibil cu 5");
            } else {
                System.out.println(Numar + " nu este impar dar nu este divizibil cu 5");
            }
        } else {
            if (Numar % 5 == 0) {
                System.out.println(Numar + " este par si divizibil cu 5");
            } else {
                System.out.println(Numar + " este par dar nu este divizibil cu 5");
            }
        }

    }

    //Switch case pt zilele saptamanii

    public void PrinteazaZi(String ZiCurenta){
        switch (ZiCurenta){
            case "Duminica":
                System.out.println(" Astazi este duminica");
                break;
            case "Luni":
                System.out.println(" Astazi este luni");
                break;
            case "Marti":
                System.out.println(" Astazi este marti");
                break;
        }
    }
}

