/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision3;

/**
 *
 * @author 21655
 */
public class Compte {
    private int numero;
    private double solde ;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Compte() {
    }
    public boolean depot(double depot_solde){
        this.solde+=depot_solde;
        return true;
    }
    public boolean retrait(double retarit_solde){
        if (solde>=retarit_solde){
            solde-=retarit_solde;
            return true;
        }else {
            System.err.println("you can't retrieve from you account your solde is "+this.solde);
            return false;
        }
    }
    public double solde(){
        return this.solde;
    }

    @Override
    public String toString() {
        return  " solde=" + solde + '}';
    }
    
   
}
