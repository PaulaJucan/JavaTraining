package Tema;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tema2 {

    @Test
    public void Tema2() {
        //MicDejun();
        CheeseCakeCuZmeura();

    }

    public void MicDejun() {
        String[] Sir = new String[6];
        Sir[0] = "Sunca";
        Sir[1] = "Salam";
        Sir[2] = "Papara";
        Sir[3] = "Bacon";
        Sir[4] = "Ceai";
        Sir[5] = "Suc de portocale";
        for (Integer index = 0; index < Sir.length; index++) {
            System.out.println(Sir[index]);
        }
    }


    public void CheeseCakeCuZmeura() {
        List<String> Blat = new ArrayList<>();
        Blat.add("5 oua");
        Blat.add("150 g faina");
        Blat.add("50 ml ulei");
        Blat.add("125 g zahar");
        Blat.add("30 g cacao");
        Blat.add("vanilie");
        Blat.add("un praf de sare");

        List<String> CremadeBranza = new ArrayList<>();
        CremadeBranza.add("750 g branza de vaci");
        CremadeBranza.add("100 g zahar pudra");
        CremadeBranza.add("250 g capsuni");
        CremadeBranza.add("15 g de gelatina");
        CremadeBranza.add("coaja de lamaie");

        List<String> JeleuldeFructe = new ArrayList<>();
        JeleuldeFructe.add("300 g capsuni");
        JeleuldeFructe.add("50 g zahar tos");
        JeleuldeFructe.add("zeama de la jumatate de lamaie");
        JeleuldeFructe.add("20 g gelatina");

        List<String> Decor = new ArrayList<>();
        Decor.add("zahar pudra");
        Decor.add("fructe proaspete: capsuni, zmeura, fragi, afine, coacaze, agrise, frunze de menta etc");

        HashMap<String, List<String>> Hmap = new HashMap<>();
        Hmap.put("Blat: ", Blat);
        Hmap.put("Crema de branza: ", CremadeBranza);
        Hmap.put("Jeleul de fructe: ", JeleuldeFructe);
        Hmap.put("Decor: ",Decor);
        System.out.println("Cheesecake cu zmeura. ");
        for (String key : Hmap.keySet()) {

            System.out.print("Ingrediente "+key);
            System.out.println( Hmap.get(key));
        }


    }

}

