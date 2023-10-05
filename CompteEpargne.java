package compteBancire;

import java.util.List;

public class CompteEpargne extends compte{
    private double tauxInterets;

    public CompteEpargne(String code, double solde, StatutCompte statut, double tauxInterets) {
        super(code, solde, statut );
        this.tauxInterets = tauxInterets;
    }

    @Override
    public void retrait(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Le montant du versement doit être positif.");
        }
    }
    @Override
    public void transfererVers(compte compteDestinataire, double montant) {
        if (this.consulterSolde() >= montant) {
            this.retrait(montant);
            compteDestinataire.virement(montant);
            for(int i=0; i < 2; i++)
                this.solde -= montant;
        }
    }
    @Override
    public String toString() {
        return super.toString()+"tauxInterets=" + this.tauxInterets + ", solde=" + this.solde ;
    }
}
