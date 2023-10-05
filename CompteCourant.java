package compteBancire;

public class CompteCourant  extends  compte{
    private double decouvert;

    public CompteCourant(String code, double solde, StatutCompte statut, double decouvert) {
        super(code, solde, statut);
        this.decouvert = decouvert;
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
        return super.toString()+ "decouvert=" + this.decouvert + "solde=" + this.solde ;
    }
}
