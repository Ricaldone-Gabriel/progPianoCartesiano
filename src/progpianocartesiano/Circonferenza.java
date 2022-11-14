/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progpianocartesiano;

/**
 * Collocare casualmente 10 circonferenze sul piano cartesiano, generando le coordinate del centro (tra -9 e 9 in ascissa e in ordinata), un raggio compreso tra 1 e 9 e il colore (assegnato casualmente fra rosso, verde e giallo)
Gestire un Array di oggetti.
Visualizzare quante circonferenze di colore verde sono state create.
Visualizzare la media delle aree delle circonferenze create.
Visualizzare quante circonferenze hanno l'ascissa positiva del centro
 * @author gabriel.ricaldone
 */
public class Circonferenza {
    String colore;
    float raggio;
    int posX;
    int posY;
    
    Circonferenza() {
        int coloreRand;
        
        raggio = (float) Math.random() * 8 + 1;
        posX = (int) (Math.random() * 20 - 10);
        posY = (int) (Math.random() * 20 - 10);
        
        coloreRand = (int) (Math.random() * 3);
        switch(coloreRand) {
            case 0:
                colore = "rosso";
                break;
                
            case 1:
                colore = "verde";
                break;
                
            case 2:
                colore = "giallo";
                break;
        }
    }
        
        public float calcolaArea() {
            return (float) ((raggio*raggio) * Math.PI);
        }
        
        public String getColore() {
            return colore;
        }
        
        public float getRaggio() {
            return raggio;
        }
        
        public int getPosX() {
            return posX;
        }
        
        public int getPosY() {
            return posY;
        }
    }

