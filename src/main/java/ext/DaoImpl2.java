package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.IDao;

@Component("vws")
@Repository("vws")
public class DaoImpl2 implements IDao {

    @Override
    public String versionName() {
        return "Version Web Services";
    }

    @Override
    public double getData() {

        return 55;
    }

    @Override
    public String getName() {
        return "Json";
    }
}
