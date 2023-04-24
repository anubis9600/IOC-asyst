package ext;

import dao.IDao;

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
