/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> lesActionsDuTrader;
    
    public Trader (int unId, String unNom)
    {
        idTrader=unId;
        nomTrader=unNom;
        lesActionsDuTrader=new ArrayList<>();
        
    }

    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @param idTrader the idTrader to set
     */
    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @param nomTrader the nomTrader to set
     */
    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    /**
     * @return the lesActionsDuTrader
     */
    public ArrayList<Action> getLesActionsDuTrader() {
        return lesActionsDuTrader;
    }

    /**
     * @param lesActionsDuTrader the lesActionsDuTrader to set
     */
    public void setLesActionsDuTrader(ArrayList<Action> lesActionsDuTrader) {
        this.lesActionsDuTrader = lesActionsDuTrader;
    }

    /**
     * @return the lesTrader
     */
 
    
    
}
