package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component("dao")
@Repository
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

        return "SQL";
    }
}
