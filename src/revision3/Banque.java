/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author 21655
 */
public class Banque {

    String nom;
    private Compte c;
    static int i;
    Map<Integer, Compte> mp;

    public Banque(String nom) {
        this.i = 0;
        this.nom = nom;
        this.mp = new HashMap<Integer, Compte>();
    }

    public void creerCompte(double init) {
        i++;
        c = new Compte(i, init);
        this.mp.put(i, c);
    }

    public boolean isNumCompte(int n) {
        return mp.containsKey(n);
    }

    public boolean depot(int num, double m) {
        if (isNumCompte(num)) {
            Compte co = this.mp.get(num); // jib l compte li hashtek bih "co"
            co.depot(m); // zidlou el solde hne 
            return true;
        }
        return false;
    }

    public boolean virerVers(double m, int numS, int numD, Banque b) {
        if (b.isNumCompte(numS) || b.isNumCompte(numD)) {
            Compte Sender = this.mp.get(numS);
            if (Sender.retrait(m)) {
                b.depot(numD, m);
                return true;
            }
        }
        return false;
    }

    public boolean virerVers(double m, int numS, int numD) {
        if (isNumCompte(numS) || isNumCompte(numD)) {
            Compte Sender = this.mp.get(numS);
            if (Sender.retrait(m)) {
                this.depot(numD, m);
                return true;
            }
        }
        return false;
    }

    private Compte getCompteDeNum(int n) {
        return this.mp.get(n);
    }

    public double getSoldeTous() {
        int sum = 0;
        for (Map.Entry<Integer, Compte> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            Compte sc = getCompteDeNum(key);
            sum += sc.solde();
        }
        return sum;
    }

    public void afficheTousLesComptes() {
        for (Map.Entry<Integer, Compte> en : mp.entrySet()) {
            Object key = en.getKey();
            Object val = en.getValue();
            System.out.println("Banque: " + this.nom + " " + key + " " + val.toString());
        }
    }

    // fazet null toksed beha sfer moush null khater solde double tnajemesh tcomparih b null
    public void nettoyer() { /// kif ma aamlet heya fil correction
        Set<Map.Entry<Integer, Compte>> paires = mp.entrySet();
        Iterator<Map.Entry<Integer, Compte>> iter = paires.iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Compte> c = iter.next();
            if (c.getValue().solde() == 0) {
                iter.remove();
            }
        }
    }
    // kdhit l value ( comptes) w pushit'hom fi list w sortit'hom selon solde fi west'hom bel classe ordreParSolde eli kbal ken com nekhdmouh fih fih west l classe hne , tao aamlneha externe 
    //
    public void TrieParSolde(){
        List<Compte> listeComptes = new ArrayList<>(mp.values());
        Collections.sort(listeComptes,new ordreParSolde()) ;
        Iterator<Compte> it = listeComptes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    
}
