package ProblemaJOEL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * La classe Problema conté un mètode principal que processa una llista de noms de Pokémon
 * i determina quantes vegades es repeteix cada nom.
 * 
 * @author Arian Polo Bustinzuriaga
 * @version 1.0
 */

public class Problema {

    /**
     * El mètode principal processa una llista de noms de Pokémon.
     * Per a cada nom a la llista, compta quantes vegades es repeteix.
     * Després imprimeix els noms únics i quantes vegades es repeteixen.
     *
     * @param args Una llista de cadenes que representen noms de Pokémon.
     */
	
    public static void main(List<String> args) {
        int index = 0;
        int casos1 = Integer.parseInt(args.get(index++));
        
        for (int i = 0; i < casos1; i++) {
            int casos2 = Integer.parseInt(args.get(index++));
            
            ArrayList<String> noms = new ArrayList<>();
            HashMap<String, Integer> count = new HashMap<>();
            
            for (int j = 0; j < casos2; j++) {
                String nom = args.get(index++);
                noms.add(nom);
                count.put(nom, count.getOrDefault(nom, 0) + 1);
            }
            
            ArrayList<String> nomsUnics = new ArrayList<>();
            boolean repetido = false;
            
            for (int j = 0; j < noms.size(); j++) {
                String nom = noms.get(j);
                if (!nomsUnics.contains(nom)) {
                    nomsUnics.add(nom);
                }
            }
            
            System.out.println(nomsUnics);
            
            HashMap<Integer, ArrayList<String>> repetidos = new HashMap<>();
            for (String nom : nomsUnics) {
                if (count.get(nom) > 1) {
                    repetido = true;
                    if (!repetidos.containsKey(count.get(nom))) {
                        repetidos.put(count.get(nom), new ArrayList<>());
                    }
                    repetidos.get(count.get(nom)).add(nom);
                }
            }
            
            if (repetido) {
                for (Map.Entry<Integer, ArrayList<String>> entry : repetidos.entrySet()) {
                    if (entry.getValue().size() == 1) {
                        System.out.println(entry.getValue().get(0) + " s'ha repetit " + entry.getKey() + " vegades");
                    } else {
                        System.out.println("Les cartes " + entry.getValue() + " s'han repetit " + entry.getKey() + " vegades");
                    }
                }
            }
            else {
                System.out.println("No s'ha repetit cap carta de Pokémon");
            }
        }
    }
}
