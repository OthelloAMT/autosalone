/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autosalone;

/**
 *
 * @author cosentino.tommaso
 */
public class Autovetture extends Veicoli{
    private int posti;
    void setNp(int posti){
        this.posti = posti;
    }
    int getNp(){
        return posti;
    }
}
