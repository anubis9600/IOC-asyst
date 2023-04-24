package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.IDao;

// @Component("vc")
@Repository("vc")
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
