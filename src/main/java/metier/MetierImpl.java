package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

// @Component
@Service
public class MetierImpl implements IMetier {

    // @Autowired
    // @Qualifier("vc")
    private IDao dao; // Couplage faible

    // Injection via le constructeur en enlevant l'annotation @Autowired
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public String version() {
        return dao.versionName();
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*11.4;

        return res;
    }

    @Override
    public String natureData() {
        String nature = dao.getName();
        String type = "Nature: "+nature;

        return type;
    }

    /**
     * Pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implemente l'interface IDao
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
