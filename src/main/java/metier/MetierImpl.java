package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible

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
