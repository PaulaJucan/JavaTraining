package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Obiect {

    @Test
    public void Obiect(){
       // PrintNumeArray();
       // PrintNumeLista();
       // PrintValoriHashmap();
        TariOrase();

    }

   //Array=toate elementele sunt de acelasi tip
   //List
   //Hashmap=Key Value

    //Printam toate valorile dintr-un array
    public void PrintNumeArray(){
        String[] Sir=new String[4];
        Sir[0]="Ana";
        Sir[1]="Alex";
        Sir[2]="Bogdan";
        Sir[3]="Rares";
        for (Integer index=0;index<Sir.length;index++){
            System.out.println(Sir[index]);
        }
    //lenght=aflam dimensiunea sirului


    }

    public void PrintNumeLista(){
        List<String> Lista=new ArrayList<>();
        Lista.add("Ana");
        Lista.add("Alex");
        Lista.add("Bogdan");
        Lista.add("Rares");
        for (Integer index=0;index<Lista.size();index++) {
            System.out.println(Lista.get(index));
        }

    }
    //Primteaza valori diferite dintr-o multime

    public void PrintValoriHashmap(){
        HashMap<String,String> HHBB=new HashMap<>();
        HHBB.put("fruct","mar");
        HHBB.put("haine","pantalon");
        HHBB.put("legume","cartof");
        for (String key: HHBB.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + HHBB.get(key));
        }
    }

    public void TariOrase(){
        List<String> OraseRomania=new ArrayList<>();
        OraseRomania.add("Dej");
        OraseRomania.add("Gherla");
        OraseRomania.add("Cluj");
        List<String> OraseItalia=new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Torino");
        List<String> OraseSpania=new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Valencia");

        HashMap<String,List<String>> Hmap=new HashMap<>();
        Hmap.put("Romania ", OraseRomania);
        Hmap.put("Italia ", OraseItalia);
        Hmap.put("Spania", OraseSpania);
        for (String key: Hmap.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + Hmap.get(key));
        }



    }


}
