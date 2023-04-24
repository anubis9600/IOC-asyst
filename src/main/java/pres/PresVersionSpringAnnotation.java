package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class PresVersionSpringAnnotation {
    public static void main(String[] args) {
        // System.out.println("Injection avec Annotation avec @Autowired");
        System.out.println("Injection avec constructeur");
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.version());
        System.out.println(metier.calcul());
        System.out.println(metier.natureData());
    }
}