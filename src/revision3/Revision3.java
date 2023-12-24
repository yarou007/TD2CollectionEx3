/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revision3;

/**
 *
 * @author 21655
 */
public class Revision3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banque b1 = new Banque("BH");
        b1.creerCompte(100);//100 -> 200 
        b1.creerCompte(200); // 200 -> 300 
        b1.creerCompte(50); // 200 -> 300 
        b1.creerCompte(0); // 200 -> 300 
        //System.err.println(b1.getSoldeTous());
               b1.afficheTousLesComptes();
               System.out.println("Affichage netoyer");
               b1.nettoyer();
                b1.afficheTousLesComptes();
               System.out.println("Affichage trier");
               b1.TrieParSolde();
           
         Banque b2 = new Banque("AMEL");
        b2.creerCompte(100);
        b2.creerCompte(200);

        // System.out.println(b1.isNumCompte(3)); testing containts ;
       // b1.depot(1, 100);
       // b1.depot(2, 100);
        //b1.virerVers(200, 2, 1);
     //    b1.afficheTousLesComptes();

       // b2.afficheTousLesComptes();
        
    }
    
}
