package compteBancire;

import java.util.Date;

public class Versemaent extends Operation {
        private compte compte;

        public Versemaent(compte compte, double montant) {
            super(montant);
            this.compte = compte;
        }

    }


