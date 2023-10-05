package compteBancire;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

         try{
             // String nomFichier = "test.txt";
             CompteEpargne compte2 = new CompteEpargne("CE001", 5000.0, StatutCompte.SUSPENDU, 0.05);
             CompteCourant compte1 = new CompteCourant("CE006", 5000.0, StatutCompte.BLOQUE, 0.05);
             compte2.virement(100);
             compte2.transfererVers(compte1,100);
             //compte2.transfererVers(compte1,100);

             System.out.println( compte2.Operations());

//             List<Operation> listeComptes = new ArrayList<>();
//             listeComptes.add(operation1);
             FileWriter file= new FileWriter("C:\\Users\\DELL\\IdeaProjects\\test\\src\\compteBancire\\test.txt");
             file.write(String.valueOf(compte2.Operations()));
              file.close();
              file.flush();
         }catch (Exception e){
             System.out.println(e.getMessage());
         }finally {
             System.out.println("fin programme thank you ...");
         }

    }}






