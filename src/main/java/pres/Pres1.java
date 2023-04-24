package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        System.out.println("Injection avec Instanciation statique");
        DaoImpl dao = new DaoImpl(); // Instanciation statique
        MetierImpl metier = new MetierImpl(dao); // Injection via constructeur

        //metier.setDao(dao); // Injection des dépendances, la classe qui ne dépends des autres classe: est fermé à la modif


        System.out.println(metier.natureData() +"\n"+ metier.calcul());
    }
}
