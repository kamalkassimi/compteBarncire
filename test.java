import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class test {
    public static void main(String[] args) {

        CompteCourant compte1 = new CompteCourant("CC", 3000,StatutCompte.SUPPRIME, 100);
        CompteCourant compte2 = new CompteCourant("CC11", 3000,StatutCompte.SUPPRIME, 100);

        //CompteEpargne compte2 = new CompteEpargne("null", 1000,StatutCompte.CREE, 0.05);
        // compte1.transfererVers(compte2,300);
         compte1.retrait(100);
        // compte1.virement(400);
        // compte1.retrait(100);
        // compte1.retrait(100);
        System.out.println(compte1);
       System.out.println( compte2);
       System.out.println(compte1.consulterTotalretrait());
       System.out.println(compte1.consulterTotalVersements());
    }}






