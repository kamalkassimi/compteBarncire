public class CompteCourant extends compte {
    private double decouvert;

    public CompteCourant(String code, double solde, StatutCompte statut, double decouvert) {
        super(code, solde, statut);
        this.decouvert = decouvert;
    }
    public double getdecouvert(){
        return this.decouvert;
    }

    @Override                  /*Objcet of Compte*/
    public void transfererVers(compte compte, double montant) {
        if (this.consulterSolde() >= montant) {
            this.retrait(montant);
            compte.virement(montant);
            ajouterOperation(new Operation(montant));
              solde -= montant;
        }
    }
   

    public void retrait(double montant) {
        if (montant > 0 && (solde - montant) >= decouvert) {
            solde -= montant;
        } else {
            System.out.println("Impossible de retirer ce montant pour ce compte.");
        }
    }
    @Override
    public String toString() {
        return super.toString()+ "decouvert=" + this.decouvert + "solde=" + this.solde ;
    }
}
