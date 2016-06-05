package pe.edu.utp.hrserviceapp.models;

import java.sql.Connection;

/**
 * Created by GrupoUTP on 04/06/2016.
 */
public class BaseEntity {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
