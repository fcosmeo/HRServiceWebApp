package pe.edu.utp.hrserviceapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 10/06/2016.
 */
public class CountriesEntity extends BaseEntity {
    private static String DEFAULT_QUERY = "SELECT * FROM countries";

    public List<Country> findAll() {
        String query = DEFAULT_QUERY;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            List<Country> countries = new ArrayList<>();
            while(rs.next()) {
                Country country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
                countries.add(country);
            }
            return countries;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Country findById(int id) {
        Country country = null;
        String query = DEFAULT_QUERY + " WHERE country_id = " + Integer.toString(id);
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            if(rs.next()) {
                country = new Country(
                    rs.getString("country_id"),
                    rs.getString("country_name"),
                    rs.getInt("region_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return country;
    }

    public Country findByName(String name) {
        Country country = null;
        String query = DEFAULT_QUERY + " WHERE country_id = '" + name + "'";
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            if(rs.next()) {
                country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return country;
    }

    public List<Country> findByRegion(Region region) {
        String query = DEFAULT_QUERY + " where region_id =" + region.getId();
        List<Country> countries = null;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            countries = new ArrayList<>();
            while(rs.next()) {
                Country country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
                countries.add(country);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countries;
    }
    public List<Country> findCountriesWhereNameContains(String text){
        String query = DEFAULT_QUERY + " where country_name like '% " + text+"%'";
        List<Country> countries = null;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            countries = new ArrayList<>();
            while(rs.next()) {
                Country country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
                countries.add(country);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countries;

    }
}
