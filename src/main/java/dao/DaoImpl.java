package dao;

import dao.IDao;

public class DaoImpl implements IDao {

    @Override
    public String versionName() {
        return "Version base des données";
    }

    @Override
    public double getData() {

        double data = 34;

        return data;
    }

    @Override
    public String getName() {

        return "DB";
    }
}
