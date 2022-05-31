package Structuri;

import org.junit.Test;

public class Algebra {

    @Test
    public void Algebtatest(){
      //Printeazanumere();
      //Printeazanrwhile();
      PrinteazaPar(20);
    }

    //Printam primele 50 numere  [0...50] cu FOR
    public void Printeazanumere(){
        for (Integer index=0;index<51;index++){
            System.out.println(index);
        }

    }
    //Printam primele 50 numere [0...50] cu WHILE
    public void Printeazanrwhile(){
        Integer index=0;
        while (index<51){
            System.out.println(index);
            index++;
        }
    }

    //FOR are un nr finit de pasi care trebuie sa ii declari
    //While are un nr infinit de pasi
    //While se foloseste cand trebuie sa astepti pana se incarca un element


    //Printeaza numerele pare de la 0...n
    public void PrinteazaPar(Integer capat){
        for (Integer index=0;index<capat+1;index++){
            if (index%2==0){
                System.out.println(index);
            }

        }

    }

}
