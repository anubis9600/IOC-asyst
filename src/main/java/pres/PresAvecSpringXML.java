package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        System.out.println("Injection avec XML");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        // IMetier metier = springContext.getBean(IMetier.class);
        IMetier metier = (IMetier) springContext.getBean("metier");

        System.out.println(metier.version());
        System.out.println(metier.calcul());
    }
}
