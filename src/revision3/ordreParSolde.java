/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 21655
 */
public  class ordreParSolde implements Comparator<Compte>{

       @Override
        public int compare(Compte compte1, Compte compte2) {
            // Comparaison des soldes de maniere décroissante -> compte 2 yji kbal 1
               return Double.compare(compte2.solde(), compte1.solde());
            
    }
        
}
