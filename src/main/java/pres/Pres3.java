package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres3 {
    public static void main(String[] args) throws Exception {
        // FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
        Scanner scanner = new Scanner(System.in);

        // DaoImpl dao = new DaoImpl();
        System.out.print("Entrer la classe dao : ");
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // Instanciation dynamique

        // MetierImpl metier = new MetierImpl();
        System.out.print("Entrer la classe metier : ");
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance(); // Instanciation dynamique

        // metier.setDao(dao)
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Injection des dépendances

        System.out.println(metier.version());
        System.out.println(metier.natureData());
        System.out.println(metier.calcul());
    }
}
