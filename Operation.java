package compteBancire;

import java.util.Date;

public class Operation {
    private static int num = 1;
    private int numero;
    private Date date;
    private double montant;
    private OperationType type;

    public Operation(double montant ,OperationType type ) {
        this.numero = num++;
        this.date = new Date();
        this.montant = montant;
        this.type = type;
    }

    public Operation(double montant) {
    }

    public double getMontant() {
        return montant;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Operation.num = num;
    }
    public OperationType getType(){
        return  this.type;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return  "numero=" + numero + ", date=" + date + ", montant=" + montant + "type :"+this.type;
    }
}
