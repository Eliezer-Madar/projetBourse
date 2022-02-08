/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double valeurAction;
    private double prixAction;
    private int quantiteAction;
    
    public Action (int unId, String unNom,double uneValeur,double unPrix,int uneQuantite )
    {
        idAction=unId;
        nomAction=unNom;
        valeurAction=uneValeur;
        prixAction=unPrix;
        quantiteAction=uneQuantite;
        
    }

    /**
     * @return the idAction
     */
    public int getIdAction()
    {
        return idAction;
    }

    /**
     * @param idAction the idAction to set
     */
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @return the valeurAction
     */
    public double getValeurAction() {
        return valeurAction;
    }

    /**
     * @param valeurAction the valeurAction to set
     */
    public void setValeurAction(double valeurAction) {
        this.valeurAction = valeurAction;
    }

    /**
     * @return the prixAction
     */
    public double getPrixAction() {
        return prixAction;
    }

    /**
     * @param prixAction the prixAction to set
     */
    public void setPrixAction(double prixAction) {
        this.prixAction = prixAction;
    }

    /**
     * @return the quantiteAction
     */
    public int getQuantiteAction() {
        return quantiteAction;
    }

    /**
     * @param quantiteAction the quantiteAction to set
     */
    public void setQuantiteAction(int quantiteAction) {
        this.quantiteAction = quantiteAction;
    }
    
}
