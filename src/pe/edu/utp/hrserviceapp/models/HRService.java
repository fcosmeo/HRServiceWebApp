package pe.edu.utp.hrserviceapp.models;

import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;

public class HRService {
    private RegionsEntity regionsEntity;
    Connection connection;
    DataSource dataSource;
    private static String DATA_SOURCE = "jdbc/MySQLDataSource";

    public HRService(InitialContext context){
        try {
            dataSource = (DataSource) context.lookup(DATA_SOURCE);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public boolean connect() {
        if(connection == null) {
            try {
                connection = dataSource.getConnection();
                return(connection != null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public Connection getConnection() {
        if(connection== null) {
            if(!connect()) {
                return null;
            };
        }
        return connection;
    }
    public RegionsEntity getRegionsEntity() {
        if(regionsEntity == null) {
            regionsEntity = new RegionsEntity();
            regionsEntity.setConnection(getConnection());
        }
        return regionsEntity;
    }

    public void setRegionsEntity(RegionsEntity regionsEntity) {
        this.regionsEntity = regionsEntity;
    }
}
