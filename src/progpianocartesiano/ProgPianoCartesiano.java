/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progpianocartesiano;

/**
 *
 * @author gabriel.ricaldone
 */
public class ProgPianoCartesiano {

    /**
     * @param args the command line arguments
     * Collocare casualmente 10 circonferenze sul piano cartesiano, generando le coordinate del centro (tra -9 e 9 in ascissa e in ordinata), un raggio compreso tra 1 e 9 e il colore (assegnato casualmente fra rosso, verde e giallo)
        Gestire un Array di oggetti.
        Visualizzare quante circonferenze di colore verde sono state create.
        Visualizzare la media delle aree delle circonferenze create.
        Visualizzare quante circonferenze hanno l'ascissa positiva del centro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circonferenza cerchi[] = new Circonferenza[10];
        float mediaAree = 0;
        int contVerde = 0,contAscissa = 0;
        
        for (int i = 0; i < 10; i++) {
            cerchi[i] = new Circonferenza();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Cerchio " + i + ":");
            System.out.println(" -Area: " + cerchi[i].calcolaArea());
            System.out.println(" -Colore: " + cerchi[i].getColore());
            System.out.println(" -Raggio: " + cerchi[i].getRaggio());
            System.out.println(" -Posizione ( " + cerchi[i].getPosX() + "," + cerchi[i].getPosY() +")");
            System.out.println();
        }
        
        for (int i = 0; i < 10; i++) {
            mediaAree += cerchi[i].calcolaArea();
        }
        mediaAree = mediaAree/10;
        
        System.out.println("La media di tutte le aree è: " + mediaAree);
        
        for (int i = 0; i < 10; i++) {
            if (cerchi[i].getColore().equals("verde")) {
                contVerde++;
            }
        }
        
        System.out.println("Ci sono " + contVerde + " cerchi verdi"); 
        
        for (int i = 0; i < 10; i++) {
            if (cerchi[i].getPosX() > 0) {
                contAscissa++;
            }
        }
        
        System.out.println("Ci sono " + contAscissa + " con ascisse positive");
    }
    
}
