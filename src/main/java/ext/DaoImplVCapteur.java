package ext;

import dao.IDao;

public class DaoImplVCapteur implements IDao {
    @Override
    public String versionName() {
        return "Version capteur";
    }

    @Override
    public double getData() {

        double data = 6;
        return data;
    }

    @Override
    public String getName() {
        String type = "xml";
        return type;
    }
}
