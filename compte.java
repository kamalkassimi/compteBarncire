// package compteBancire;

import java.util.ArrayList;
import java.util.List;

public abstract  class compte {
        private String code;
        public  double solde;
        private StatutCompte statut;
        private List<Operation> operations;

        public compte(String code, double solde, StatutCompte statut) {
            this.code = code;
            this.solde = solde;
            this.statut = statut;
            this.operations = new ArrayList<>();
        }

    public compte(double montant) {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public StatutCompte getStatut() {
        return statut;
    }

    public void setStatut(StatutCompte statut) {
        this.statut = statut;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    public List<Operation> Operations() {
        return this.operations;
    }

    public void ajouterOperation(Operation operation) {
        operations.add(operation);
    }
    public void virement(double montant) {
        if (montant > 0) {
            this.solde += montant;
            ajouterOperation(new Operation(montant));
        } else {
            System.out.println("Le montant du versement doit être positif.");
        }
    }

    public void retrait(double montant){}

 
    public double consulterSolde() {
        return this.solde;
    }
    
    public void transfererVers(compte compte, double montant) {
        if (this.consulterSolde() >= montant) {
            this.retrait(montant);
            compte.virement(montant);
            ajouterOperation(new Operation(montant));
            for(int i=0; i < 1; i++)
                this.solde -= montant;
        }
    }
   
    public double consulterTotalVersements() {
        double totalVersements = 0;
        for (Operation operation : operations) {
            if (operation instanceof Versemaent) {
                totalVersements += operation.getMontant();            }
        }
        return totalVersements;
    }
    public double consulterTotalretrait() {
        double totalretraits = 0;
        for (Operation operation : operations) {
            if(operation instanceof Retrait)
            totalretraits += operation.getMontant();
        }
        return totalretraits;
    }
    @Override
    public String toString() {
        return  "code='" + code + '\'' + ", solde=" + solde + ", statut=" + statut ;
    }
}